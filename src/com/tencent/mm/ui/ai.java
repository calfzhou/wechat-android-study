package com.tencent.mm.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.mm.sdk.platformtools.ak;

public abstract class ai extends Fragment
{
  public boolean iJh;
  public boolean iJi = false;

  public ai()
  {
    this.iJh = false;
  }

  public ai(boolean paramBoolean)
  {
    this.iJh = paramBoolean;
  }

  public final SharedPreferences Bp(String paramString)
  {
    return h().getSharedPreferences(paramString, 0);
  }

  public final Boolean Bq(String paramString)
  {
    if ((this.iJh) && (getArguments() == null))
      return Boolean.valueOf(h().getIntent().getBooleanExtra(paramString, false));
    return Boolean.valueOf(getArguments().getBoolean(paramString, false));
  }

  public final void aOX()
  {
    if (this.iJh)
      h().setResult(-1);
  }

  public final View findViewById(int paramInt)
  {
    View localView1 = getView();
    View localView2 = null;
    if (localView1 != null)
      localView2 = localView1.findViewById(paramInt);
    if (localView2 != null)
      return localView2;
    return h().findViewById(paramInt);
  }

  public void finish()
  {
    if (this.iJh)
      h().finish();
    while (h() == null)
      return;
    h().o().popBackStack();
  }

  public final int getIntExtra(String paramString, int paramInt)
  {
    if ((this.iJh) && (getArguments() == null))
      paramInt = h().getIntent().getIntExtra(paramString, paramInt);
    while (getArguments() == null)
      return paramInt;
    return getArguments().getInt(paramString, paramInt);
  }

  public final Resources getResources()
  {
    FragmentActivity localFragmentActivity = super.h();
    if (localFragmentActivity == null)
      return ak.getContext().getResources();
    return localFragmentActivity.getResources();
  }

  public final String getStringExtra(String paramString)
  {
    boolean bool = this.iJh;
    String str = null;
    if (bool)
      str = h().getIntent().getStringExtra(paramString);
    if ((str == null) && (getArguments() != null))
      str = super.getArguments().getString(paramString);
    return str;
  }

  public final Window getWindow()
  {
    if (h() != null)
      return h().getWindow();
    return null;
  }

  public final WindowManager getWindowManager()
  {
    if (h() != null)
      return h().getWindowManager();
    return null;
  }

  public final boolean isFinishing()
  {
    if (h() == null)
      return true;
    return h().isFinishing();
  }

  public final boolean isShowing()
  {
    return !this.iJi;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.iJi = true;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      finish();
      return true;
    }
    if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
      return onKeyUp(paramInt, paramKeyEvent);
    return false;
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public void openContextMenu(View paramView)
  {
    if (h() != null)
      h().openContextMenu(paramView);
  }

  public final void sendBroadcast(Intent paramIntent)
  {
    h().sendBroadcast(paramIntent);
  }

  public final void setRequestedOrientation(int paramInt)
  {
    if (h() != null)
      h().setRequestedOrientation(paramInt);
  }

  public final void startActivity(Intent paramIntent)
  {
    FragmentActivity localFragmentActivity = super.h();
    if (localFragmentActivity == null)
    {
      ak.getContext().startActivity(paramIntent);
      return;
    }
    localFragmentActivity.a(this, paramIntent, -1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ai
 * JD-Core Version:    0.6.2
 */