package com.example.pam5

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pam5.Data.DataFrom
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var emailusr : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var statususr : String by mutableStateOf("")
        private set
    var alamatusr : String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(DataFrom())
    val uiState: StateFlow<DataFrom> = _uiState.asStateFlow()

    fun insertData (nm: String, tlp: String, eml: String, jk: String, stts: String, alt : String){
        namaUsr = nm;
        noTlp = tlp;
        emailusr = eml;
        jenisKl = jk;
        statususr = stts;
        alamatusr = alt;
    }

    fun setjenisKl(pilihJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }

    fun setstatus(pilihST: String){
        _uiState.update { currentState -> currentState.copy(stts = pilihST) }
    }
}