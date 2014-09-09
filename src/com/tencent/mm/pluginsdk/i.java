package com.tencent.mm.pluginsdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ah;
import com.tencent.mm.storage.ar;
import java.util.ArrayList;
import java.util.List;

public abstract interface i
{
  public abstract int KG();

  public abstract List KH();

  public abstract void MF();

  public abstract boolean MG();

  public abstract boolean MH();

  public abstract void MK();

  public abstract boolean ML();

  public abstract ArrayList MM();

  public abstract Bitmap a(Context paramContext, int paramInt, ad paramad);

  public abstract Bitmap a(View paramView, String paramString1, int paramInt1, String paramString2, int paramInt2);

  public abstract Bitmap a(ImageView paramImageView, String paramString, ad paramad);

  public abstract ad a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4, String paramString5);

  public abstract void a(al paramal);

  public abstract void a(ad paramad);

  public abstract void a(ad paramad, Context paramContext);

  public abstract void a(String paramString, ad paramad, ar paramar);

  public abstract boolean a(Context paramContext, ar paramar);

  public abstract void aG(boolean paramBoolean);

  public abstract ah an(String paramString1, String paramString2);

  public abstract ad b(ad paramad);

  public abstract String b(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString);

  public abstract void b(Context paramContext, ar paramar);

  public abstract void b(al paramal);

  public abstract void c(al paramal);

  public abstract boolean c(String paramString1, String paramString2, long paramLong);

  public abstract void d(al paramal);

  public abstract boolean e(Context paramContext, String paramString1, String paramString2);

  public abstract boolean extractForeground(int[] paramArrayOfInt, int paramInt1, int paramInt2);

  public abstract List gq(int paramInt);

  public abstract boolean kI(String paramString);

  public abstract int kJ(String paramString);

  public abstract List kK(String paramString);

  public abstract String kN(String paramString);

  public abstract void lA(String paramString);

  public abstract void lB(String paramString);

  public abstract void lC(String paramString);

  public abstract String lD(String paramString);

  public abstract boolean lE(String paramString);

  public abstract String lw(String paramString);

  public abstract String lx(String paramString);

  public abstract ad ly(String paramString);

  public abstract void lz(String paramString);

  public abstract boolean p(ar paramar);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i
 * JD-Core Version:    0.6.2
 */