package com.front_end.app.modules.neww.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.appcomponents.di.MyApp
import com.front_end.app.databinding.ActivityNewwBinding
import com.front_end.app.extensions.isJSONObject
import com.front_end.app.firestore.models.notes
import com.front_end.app.modules.neww.`data`.viewmodel.NewwVM
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class NewwActivity : BaseActivity<ActivityNewwBinding>(R.layout.activity_neww) {
  private val viewModel: NewwVM by viewModels<NewwVM>()

  private val firestoreRef: FirebaseFirestore = Firebase.firestore


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.newVM = viewModel
    firestoreRef
      .collection("notes")
      .add(notes().apply {
        this.list1 = viewModel.newModel.value?.etContentValue
      })
      .addOnSuccessListener { documentReference ->
        onSuccessOnCreateStore(documentReference)
      }
      .addOnFailureListener { exception ->
        onErrorOnCreateStore(exception)
      }
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun onSuccessOnCreateStore(result: DocumentReference?): Unit {
    Snackbar.make(binding.root, MyApp.getInstance().getString(R.string.lbl_saved),
      Snackbar.LENGTH_LONG).show()
  }

  private fun onErrorOnCreateStore(exception: Exception): Unit {
    when(exception) {
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject())
          JSONObject(errorBody) else JSONObject()
        Snackbar.make(binding.root, MyApp.getInstance().getString(R.string.msg_please_try_again_text),
          Snackbar.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "NEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NewwActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}