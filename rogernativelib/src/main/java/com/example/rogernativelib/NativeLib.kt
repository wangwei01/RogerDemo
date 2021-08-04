package com.example.rogernativelib

class NativeLib {

    /**
     * A native method that is implemented by the 'rogernativelib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'rogernativelib' library on application startup.
        init {
            System.loadLibrary("rogernativelib")
        }
    }
}