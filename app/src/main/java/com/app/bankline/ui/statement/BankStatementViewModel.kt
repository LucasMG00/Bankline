package com.app.bankline.ui.statement

import androidx.lifecycle.ViewModel
import com.app.bankline.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)

}