package com.example.spleshscreen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class SessionManager
  {
      Context context;
      SharedPreferences sp;
      SharedPreferences.Editor editor;

      private final String PRF_FILE_NAME = "Shopping";
      private final int PRIVATE_MODE = 0;

      private final String KEY_NAME = "key_session_name";
      private final String KEY_EMAIL = "key_session_email";
      private final String KEY_PHONE = "key_session_phone";
      private final String KEY_IF_LOGGED_IN = "key_session_loggedin";

      public SessionManager(Context context)
      {
          this.context = context;
          sp = context.getSharedPreferences(PRF_FILE_NAME , PRIVATE_MODE);
          editor = sp.edit();
      }

      //--------------Check Session Data----------------->>
      public boolean checkSession()
      {
          if(sp.contains(KEY_IF_LOGGED_IN))
          {
              return true;
          }
          else {
              return false;
          }
      }

      //---------------Create Session Methods--------------->>
      public void createSession(String name , String email , String phone)
      {
          editor.putString(KEY_NAME,name);
          editor.putString(KEY_EMAIL,email);
          editor.putString(KEY_PHONE,phone);
          editor.putBoolean(KEY_IF_LOGGED_IN,true);
          editor.commit();
      }

      //---------------Clear All Data------------------>>
      public void logoutSession()
      {
          editor.clear();
          editor.commit();

          Intent intent = new Intent(context , Login.class);
          context.startActivity(intent);
      }
      //-----------get return----------------->>
      public String getSession(String key)
      {
          String value = sp.getString(key , null);
          return value;
      }
  }
