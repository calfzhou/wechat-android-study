package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;

public final class m
{
  public static SecurityImage a(Context paramContext, int paramInt, boolean paramBoolean, byte[] paramArrayOfByte, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener, DialogInterface.OnDismissListener paramOnDismissListener, r paramr)
  {
    SecurityImage localSecurityImage = (SecurityImage)View.inflate(paramContext, k.bmy, null);
    localSecurityImage.a(paramr);
    localSecurityImage.a(paramBoolean, paramArrayOfByte, paramString1, paramString2);
    ad localad = new ad(paramContext);
    localad.pn(paramInt);
    localad.d(com.tencent.mm.n.bsN, new n(localSecurityImage, paramOnClickListener));
    localad.b(paramOnCancelListener);
    localad.ao(localSecurityImage);
    localad.eN(true);
    SecurityImage.a(localSecurityImage, localad.aRB());
    SecurityImage.c(localSecurityImage).setOnDismissListener(paramOnDismissListener);
    SecurityImage.c(localSecurityImage).show();
    return localSecurityImage;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.m
 * JD-Core Version:    0.6.2
 */