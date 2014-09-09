package com.tencent.mm.ui.bindgooglecontact;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.jg.JgClassChecked;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.c;
import com.tencent.smtt.sdk.WebView;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public class BindGoogleContactUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private boolean dpm = false;
  private ProgressDialog eyO;
  private TextView fcc;
  private boolean jia = false;
  private String jic;
  private int jie;
  private WebView jij;
  private boolean jik = false;
  private String jil;
  private String jim;
  private String jin;
  private com.tencent.mm.x.a jio;
  private boolean jip = false;

  private void Mg()
  {
    if (this.jia)
    {
      this.jij.setVisibility(8);
      Mj();
      startActivityForResult(new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"), 1003);
      return;
    }
    this.fcc.setVisibility(4);
    this.jij.setVisibility(0);
    aTU();
  }

  private void Mj()
  {
    if ((this.eyO == null) || (!this.eyO.isShowing()))
    {
      getString(com.tencent.mm.n.buo);
      this.eyO = com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.buA), true, new m(this));
    }
  }

  private void aTU()
  {
    Mj();
    this.jij.getSettings().setJavaScriptEnabled(true);
    this.jij.setWebViewClient(new h(this));
    WebView localWebView = this.jij;
    z.i("!44@/B4Tb64lLpKHrGLZvbPyiJfTn1QV0AFJw0rdZYMW3Eg=", "getRequestCodeUrl:%s", new Object[] { "https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com" });
    localWebView.loadUrl("https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com");
  }

  private void aTV()
  {
    if (this.jij != null)
      this.jij.setVisibility(4);
    if (this.fcc != null)
      this.fcc.setVisibility(0);
    if (!bc.by(this));
    for (String str = getString(com.tencent.mm.n.bMW); ; str = getString(com.tencent.mm.n.bMO))
    {
      this.fcc.setText(str);
      return;
    }
  }

  private void aTW()
  {
    try
    {
      com.tencent.smtt.sdk.b.cN(this);
      com.tencent.smtt.sdk.a.bdq().removeAllCookie();
      return;
    }
    catch (Exception localException)
    {
      z.d("Google Login", "Clear cookie failed");
    }
  }

  private void aTX()
  {
    if ((this.eyO != null) && (this.eyO.isShowing()))
      this.eyO.dismiss();
  }

  private void ar(String paramString, int paramInt)
  {
    this.jic = paramString;
    qa(paramInt);
  }

  private void qa(int paramInt)
  {
    this.jio = new com.tencent.mm.x.a(c.dwt, this.jic, paramInt);
    bg.qX().d(this.jio);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.jil;
    arrayOfObject[1] = this.jim;
    z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "doScene mAppToken:%s, mWebToke:%s", arrayOfObject);
  }

  protected final void DP()
  {
    oP(com.tencent.mm.n.bMN);
    a(new g(this));
    this.jij = com.tencent.mm.ui.widget.l.h(this, com.tencent.mm.i.awJ);
    this.fcc = ((TextView)findViewById(com.tencent.mm.i.empty));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    if (TextUtils.isEmpty(paramString))
      paramString = "";
    arrayOfObject1[2] = paramString;
    z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", arrayOfObject1);
    aTX();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.jia)
      {
        bg.qW().oQ().set(208903, this.jic);
        bg.qW().oQ().set(208901, this.jil);
      }
      while (true)
      {
        Intent localIntent = new Intent(this, GoogleFriendUI.class);
        localIntent.putExtra("enter_scene", this.jie);
        startActivity(localIntent);
        finish();
        if (this.jip)
        {
          com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(6);
          arrayOfObject2[1] = Integer.valueOf(5);
          localn.d(11002, arrayOfObject2);
        }
        return;
        bg.qW().oQ().set(208903, this.jic);
        bg.qW().oQ().set(208902, this.jim);
        bg.qW().oQ().set(208904, this.jin);
      }
    }
    if (paramInt2 == com.tencent.mm.x.a.dwo)
    {
      com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.bMU), "", new k(this), new l(this));
      return;
    }
    aTV();
  }

  public final void a(boolean paramBoolean, String paramString1, String paramString2)
  {
    if ((paramBoolean) && (!TextUtils.isEmpty(paramString1)))
    {
      this.jim = paramString1;
      this.jin = paramString2;
      new n(this, this.jim).execute(new Void[0]);
      return;
    }
    aTX();
    aTV();
  }

  public final void e(boolean paramBoolean, String paramString)
  {
    if ((paramBoolean) && (!TextUtils.isEmpty(paramString)))
    {
      if ((!TextUtils.isEmpty(this.jic)) && (!TextUtils.isEmpty(paramString)) && (!this.jic.equalsIgnoreCase(paramString)))
      {
        aTX();
        com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.bMV), "", new i(this, paramString), new j(this));
        return;
      }
      this.jic = paramString;
      ar(this.jic, com.tencent.mm.x.a.dwm);
      return;
    }
    aTX();
    aTV();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bbD;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "requestCode:%d, resultCode:%d", arrayOfObject1);
    if (paramInt2 == -1)
    {
      switch (paramInt1)
      {
      default:
        return;
      case 1005:
        this.jia = paramIntent.getBooleanExtra("gpservices", false);
        Mg();
        return;
      case 1003:
        int j = paramIntent.getIntExtra("error_code", -1);
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(j);
        z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "errorCode:%d ", arrayOfObject3);
        if (j == 0)
        {
          this.jic = paramIntent.getStringExtra("account");
          if (this.dpm)
          {
            aTX();
            return;
          }
          z.d("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "startAcitivtyForGetToken");
          Intent localIntent = new Intent("com.tencent.mm.gms.ACTION_GET_TOKEN");
          localIntent.putExtra("gmail", this.jic);
          localIntent.putExtra("scope", "oauth2:https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds");
          startActivityForResult(localIntent, 1004);
          return;
        }
        aTX();
        aTV();
        return;
      case 1004:
      }
      int i = paramIntent.getIntExtra("error_code", -1);
      String str = paramIntent.getStringExtra("error_msg");
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = str;
      z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "errorCode:%d errorMsg:%s", arrayOfObject2);
      if (i == 0)
      {
        this.jil = paramIntent.getStringExtra("token");
        qa(com.tencent.mm.x.a.dwm);
        return;
      }
      aTX();
      aTV();
      return;
    }
    if (paramInt1 == 1005)
    {
      this.jia = paramIntent.getBooleanExtra("gpservices", false);
      Mg();
      return;
    }
    aTX();
    aTV();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jie = getIntent().getIntExtra("enter_scene", 0);
    this.jip = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.jia = com.tencent.mm.modelfriend.ac.A(this);
    this.jic = ((String)bg.qW().oQ().get(208903));
    DP();
    if (this.jia)
    {
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 1005);
      return;
    }
    Mg();
  }

  protected void onPause()
  {
    super.onPause();
    bg.qX().b(487, this);
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(487, this);
    this.jik = ((Boolean)bg.qW().oQ().get(208905, Boolean.valueOf(false))).booleanValue();
    if (this.jik)
    {
      aTW();
      this.jik = false;
      bg.qW().oQ().set(208905, Boolean.valueOf(false));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.BindGoogleContactUI
 * JD-Core Version:    0.6.2
 */