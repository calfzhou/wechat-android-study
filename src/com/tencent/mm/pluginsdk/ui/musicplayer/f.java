package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.mm.h;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.a.tb;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.WXMusicObject;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

public final class f
{
  private String fau;
  private String hFR;
  private tb hGu;
  private MMActivity hGv;
  private String hGw;
  private d hGx;

  public f(tb paramtb, MMActivity paramMMActivity, String paramString1, String paramString2, String paramString3, d paramd)
  {
    this.hGu = paramtb;
    this.hGv = paramMMActivity;
    this.hGw = paramString1;
    this.hGx = paramd;
    this.fau = paramString2;
    this.hFR = paramString3;
  }

  private WXMediaMessage aCW()
  {
    if (this.hGu == null)
      return null;
    WXMusicObject localWXMusicObject = new WXMusicObject();
    localWXMusicObject.musicUrl = this.hGu.ini;
    localWXMusicObject.musicDataUrl = this.hGu.ing;
    localWXMusicObject.musicLowBandUrl = this.hGu.inh;
    localWXMusicObject.musicLowBandDataUrl = this.hGu.inh;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.mediaObject = localWXMusicObject;
    localWXMediaMessage.title = this.hGu.inb;
    localWXMediaMessage.description = this.hGu.inc;
    String str;
    File localFile;
    if (this.hFR == null)
    {
      str = this.hGu.ink;
      localFile = new File(str);
      if (!localFile.exists())
        break label178;
    }
    label178: for (Bitmap localBitmap = i.wU(localFile.getAbsolutePath()); ; localBitmap = null)
    {
      if (localBitmap == null)
        localBitmap = BitmapFactory.decodeResource(this.hGv.getResources(), h.QV);
      localWXMediaMessage.thumbData = ch.o(localBitmap);
      return localWXMediaMessage;
      str = this.hFR;
      break;
    }
  }

  public final void a(tb paramtb, String paramString1, String paramString2, String paramString3)
  {
    this.hGu = paramtb;
    this.hGw = paramString1;
    this.fau = paramString2;
    this.hFR = paramString3;
  }

  public final boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((this.hGx == null) || (this.hGv == null) || (this.hGw == null))
    {
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = this.hGx;
      arrayOfObject1[1] = this.hGv;
      arrayOfObject1[2] = this.hGw;
      z.e("!44@/B4Tb64lLpJ7ZKpS3Weia+8Jv+sgGQDwGkbz9wCWSpY=", "error on ActivityResult im:%s, ac:%s, orName:%s", arrayOfObject1);
      return true;
    }
    if ((-1 == paramInt2) && (paramInt1 == 0))
    {
      if (paramIntent != null)
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        WXMediaMessage localWXMediaMessage = aCW();
        if (localWXMediaMessage != null)
        {
          this.hGx.a(this.hGv, this.fau, localWXMediaMessage, str, this.hGw);
          z.i("!44@/B4Tb64lLpJ7ZKpS3Weia+8Jv+sgGQDwGkbz9wCWSpY=", "succeed to share to friend:%s", new Object[] { str });
        }
      }
      while (true)
      {
        return false;
        z.e("!44@/B4Tb64lLpJ7ZKpS3Weia+8Jv+sgGQDwGkbz9wCWSpY=", "error on ActivityResult data == null");
      }
    }
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(paramInt2);
    arrayOfObject2[1] = Integer.valueOf(paramInt1);
    z.e("!44@/B4Tb64lLpJ7ZKpS3Weia+8Jv+sgGQDwGkbz9wCWSpY=", "error on ActivityResult not ok, resultCode:%d, requestCode:%d", arrayOfObject2);
    return true;
  }

  public final void onCreate()
  {
    if (this.hGu == null)
      return;
    this.hGv.a(0, h.Yi, new g(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.f
 * JD-Core Version:    0.6.2
 */