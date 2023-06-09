// Generated by view binder compiler. Do not edit!
package com.eky.tugasuts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.eky.tugasuts.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AboutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView appdesc;

  @NonNull
  public final TextView appname;

  @NonNull
  public final TextView appversion;

  @NonNull
  public final ImageView logo;

  private AboutBinding(@NonNull RelativeLayout rootView, @NonNull TextView appdesc,
      @NonNull TextView appname, @NonNull TextView appversion, @NonNull ImageView logo) {
    this.rootView = rootView;
    this.appdesc = appdesc;
    this.appname = appname;
    this.appversion = appversion;
    this.logo = logo;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AboutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appdesc;
      TextView appdesc = ViewBindings.findChildViewById(rootView, id);
      if (appdesc == null) {
        break missingId;
      }

      id = R.id.appname;
      TextView appname = ViewBindings.findChildViewById(rootView, id);
      if (appname == null) {
        break missingId;
      }

      id = R.id.appversion;
      TextView appversion = ViewBindings.findChildViewById(rootView, id);
      if (appversion == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      return new AboutBinding((RelativeLayout) rootView, appdesc, appname, appversion, logo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
