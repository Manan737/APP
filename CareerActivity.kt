package com.example.tutorials
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.UploadTask
import com.google.firebase.storage.ktx.storage
import java.lang.Exception


class CareerActivity:ComponentActivity() {
    val PDF:Int=0
    lateinit var url: Uri
    lateinit var mStorage:StorageReference
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.career)

        val rsmbtn=findViewById<View>(R.id.uploadResume)
        mStorage=FirebaseStorage.getInstance().getReference("Resume")
        rsmbtn.setOnClickListener(View.OnClickListener {
                view:View?->val intent= Intent()
                intent.setType("pdf/*")
                intent.setAction(Intent.ACTION_GET_CONTENT)
                startActivityForResult(Intent.createChooser(intent,"Select PDF"),PDF)


        })




    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        val urltxt=findViewById<View>(R.id.uriTxt)
        if(resultCode== RESULT_OK)
        {
            if(requestCode==PDF)
            {
                url= data!!.data!!
                upload()
            }
        }

        super.onActivityResult(requestCode, resultCode, data)
    }

    private fun upload()
    {
        try{
            var mreference=mStorage.child(url.lastPathSegment!!)
            mreference.putFile(url).addOnSuccessListener {
                    taskSnapshot:UploadTask.TaskSnapshot?->var urls=taskSnapshot!!.getStorage().getDownloadUrl()
                Toast.makeText(this,"Uploaded",Toast.LENGTH_LONG).show()
            }
        }
        catch(e:Exception)
        {
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show()
        }


    }


}