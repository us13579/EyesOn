package com.d201.eyeson.view.angel.help

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.d201.domain.usecase.help.ResponseHelpUseCase
import com.d201.domain.utils.ResultType
import com.d201.eyeson.util.JWT
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "AngelHelpViewModel"
@HiltViewModel
class AngelHelpViewModel @Inject constructor(
    private val responseHelpUseCase : ResponseHelpUseCase
) : ViewModel() {

    private val _sessionId : MutableStateFlow<Int> = MutableStateFlow(-1)
    val sessionId get() = _sessionId.asStateFlow()

    fun responseHelp() {
        viewModelScope.launch(Dispatchers.IO) {
            responseHelpUseCase.execute().collectLatest {
                if(it is ResultType.Success){
                    _sessionId.value = it.data.data
                    Log.d(TAG, "request Help: ${it.data.data}")
                } else {
                    Log.d(TAG, "requestHelp: $it")
                }
            }
        }
    }
}