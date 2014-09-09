package com.tencent.mm.l;

import android.os.Bundle;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.account.ei;

public class a
  implements m, ei
{
  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 183)
      return;
    bg.qX().b(183, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      z.i("!44@/B4Tb64lLpLASVHfQRzXfKeMA9/SAzGFsPnEq0w3Uz4=", "update token success");
      return;
    }
    z.e("!44@/B4Tb64lLpLASVHfQRzXfKeMA9/SAzGFsPnEq0w3Uz4=", "update token fail");
  }

  public void a(Bundle paramBundle)
  {
    String str1 = paramBundle.getString("access_token");
    String str2 = paramBundle.getString("expires");
    z.i("!44@/B4Tb64lLpLASVHfQRzXfKeMA9/SAzGFsPnEq0w3Uz4=", "onComplete : newToken = " + str1 + ", expires = " + str2);
    if (str2 != null)
      bg.qW().oQ().set(65832, str2);
    bg.qW().oQ().set(65830, str1);
    bg.qW().oQ().set(65831, Long.valueOf(System.currentTimeMillis()));
    bg.qX().a(183, this);
    r localr = new r(2, str1);
    bg.qX().d(localr);
  }

  public void onError(int paramInt, String paramString)
  {
    z.e("!44@/B4Tb64lLpLASVHfQRzXfKeMA9/SAzGFsPnEq0w3Uz4=", "onError : errType = " + paramInt + ", errMsg = " + paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.l.a
 * JD-Core Version:    0.6.2
 */