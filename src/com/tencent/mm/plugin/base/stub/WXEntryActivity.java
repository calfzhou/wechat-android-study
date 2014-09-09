package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.a.f;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.sdk.modelmsg.j;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXEntryActivity extends AutoLoginActivity
{
  private String appId;
  private String authority;
  private String content;
  private String ehH;
  private int ehI;
  private Uri uri;

  private static byte[] c(String paramString1, int paramInt, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null)
      localStringBuffer.append(paramString1);
    localStringBuffer.append(paramInt);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    return f.d(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
  }

  private static boolean d(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length == 0) || (paramArrayOfByte2 == null) || (paramArrayOfByte2.length == 0))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "checkSumConsistent fail, invalid arguments");
      return false;
    }
    if (paramArrayOfByte1.length != paramArrayOfByte2.length)
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "checkSumConsistent fail, length is different");
      return false;
    }
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfByte1.length)
        break label66;
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i])
        break;
    }
    label66: return true;
  }

  private void f(Intent paramIntent)
  {
    this.ehI = paramIntent.getIntExtra("_mmessage_sdkVersion", 0);
    this.content = paramIntent.getStringExtra("_mmessage_content");
    if (this.content != null)
    {
      this.uri = Uri.parse(this.content);
      this.authority = this.uri.getAuthority();
      this.appId = this.uri.getQueryParameter("appid");
    }
    this.ehH = paramIntent.getStringExtra("_mmessage_appPackage");
  }

  private static boolean fw(int paramInt)
  {
    return paramInt >= 553713665;
  }

  protected final void a(a parama, Intent paramIntent)
  {
    z.d("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "postLogin, loginResult = " + parama);
    f(paramIntent);
    switch (p.ehX[parama.ordinal()])
    {
    default:
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "postLogin, unknown login result = " + parama);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      finish();
      return;
      Intent localIntent1 = getIntent();
      k localk;
      if (("sendreq".equals(this.authority)) || ("sendresp".equals(this.authority)))
      {
        localk = l.F(this.appId, true);
        if (localk == null)
          z.w("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "app not reg, do nothing");
      }
      while (true)
      {
        finish();
        return;
        if (localk.field_status == 3)
        {
          z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "send fail, app is in blacklist");
        }
        else if (!u.b(this, localk, this.ehH))
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.appId;
          z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "send fail, check app fail, force to get app info from server again : %s", arrayOfObject);
          bf.aza().uX(this.appId);
        }
        else if (new j(localIntent1.getExtras()).cCn == 2)
        {
          Intent localIntent2 = new Intent();
          localIntent2.addFlags(268435456).addFlags(67108864);
          localIntent2.putExtras(localIntent1.getExtras());
          com.tencent.mm.am.a.b(this, "favorite", ".ui.FavOpenApiEntry", localIntent2);
        }
        else
        {
          startActivity(new Intent(this, UIEntryStub.class).addFlags(268435456).addFlags(67108864).putExtras(localIntent1.getExtras()));
          continue;
          z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "unknown authority, should never reached, authority=" + this.authority);
        }
      }
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "postLogin fail, loginResult = " + parama);
    }
  }

  protected final boolean e(Intent paramIntent)
  {
    f(paramIntent);
    if ((!bg.oE()) || (bg.rd()))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.appId;
      z.w("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "preLogin not login, save the appid : %s", arrayOfObject);
      u.vg(this.appId);
    }
    if (!fw(this.ehI))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "sdk version is not supported, sdkVersion = " + this.ehI);
      finish();
      return false;
    }
    if (this.uri == null)
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "check appid failed, null content");
      finish();
      return false;
    }
    z.i("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "preLogin, appId = " + this.appId);
    if (ap.jb(this.appId))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "invalid appid, ignore");
      finish();
      return false;
    }
    z.i("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "preLogin, pkg = " + this.ehH);
    if (ap.jb(this.ehH))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "unknown package, ignore");
      finish();
      return false;
    }
    if (!d(paramIntent.getByteArrayExtra("_mmessage_checksum"), c(this.content, this.ehI, this.ehH)))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "checksum fail");
      finish();
      return false;
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity
 * JD-Core Version:    0.6.2
 */