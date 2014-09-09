package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MotionEvent;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.j;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

public class SendAppMessageWrapperUI extends MMActivity
{
  private int cCn = 0;
  private String cIA = null;
  private String cJz = null;
  private ay dHm = new ay(new aa(this), true);
  private int ePr = 0;
  private k jYD = null;
  private WXMediaMessage jYE = null;
  private boolean jYF = false;

  private com.tencent.mm.pluginsdk.ui.applet.aa a(WXMediaMessage paramWXMediaMessage)
  {
    return new ab(this, paramWXMediaMessage);
  }

  protected final void DP()
  {
  }

  protected final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    aM().hide();
    SharedPreferences localSharedPreferences = getSharedPreferences(ak.aHi(), 0);
    if (!localSharedPreferences.getBoolean("settings_landscape_mode", false))
    {
      z.d("!56@/B4Tb64lLpLiQ1shHpyNJ3BOzGypz4AHt4GloJ5fgMawRImFynvSXQ==", "change orientation");
      this.jYF = true;
      setRequestedOrientation(-1);
      localSharedPreferences.edit().putBoolean("settings_landscape_mode", true).commit();
    }
    Bundle localBundle = getIntent().getExtras();
    j localj = new j(localBundle);
    this.cIA = localBundle.getString("Select_Conv_User");
    this.cCn = localBundle.getInt("SendAppMessageWrapper_Scene", 0);
    String str1 = localBundle.getString("SendAppMessageWrapper_AppId");
    if (str1 == null)
      str1 = Uri.parse(localBundle.getString("_mmessage_content")).getQueryParameter("appid");
    this.jYD = new k();
    this.jYD.field_appId = str1;
    bf.GO().c(this.jYD, new String[0]);
    if (this.jYD.field_appName == null);
    for (String str2 = getString(n.bAU); ; str2 = l.d(aPI(), this.jYD))
    {
      this.cJz = getString(n.bAS, new Object[] { str2 });
      this.jYE = localj.iDh;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.jYE.messageAction;
      arrayOfObject[1] = this.jYE.messageExt;
      z.v("!56@/B4Tb64lLpLiQ1shHpyNJ3BOzGypz4AHt4GloJ5fgMawRImFynvSXQ==", "onCreate, messageAction = %s, messageExt = %s", arrayOfObject);
      this.dHm.cP(100L);
      return;
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.jYF)
    {
      z.d("!56@/B4Tb64lLpLiQ1shHpyNJ3BOzGypz4AHt4GloJ5fgMawRImFynvSXQ==", "restore orientation");
      SharedPreferences localSharedPreferences = getSharedPreferences(ak.aHi(), 0);
      setRequestedOrientation(1);
      localSharedPreferences.edit().putBoolean("settings_landscape_mode", false).commit();
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    XF();
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SendAppMessageWrapperUI
 * JD-Core Version:    0.6.2
 */