package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import com.tencent.mm.aq.a;
import com.tencent.mm.k;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.ui.EmojiView;
import com.tencent.mm.pluginsdk.ui.bb;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.cn;

public final class bh
{
  private View eET;
  private View gIm;
  private bl hDw;
  private ad hEs;
  private cn hEt;
  private View hFh;
  private View hFi;
  private View hFj;
  private bb hFm;
  private String hFn;
  private String hFo = "";
  private EmojiView hxC;
  private Context mContext;

  public bh(Context paramContext, View paramView1, View paramView2, View paramView3)
  {
    this.mContext = paramContext;
    this.eET = paramView1;
    this.hFh = paramView2;
    this.hFi = paramView3;
    this.gIm = View.inflate(this.mContext, k.bck, null);
    this.hxC = ((EmojiView)this.gIm.findViewById(com.tencent.mm.i.aSi));
    int i = a.o(this.mContext, com.tencent.mm.g.Qq);
    this.hEt = new cn(this.gIm, i, i, (byte)0);
    this.hEt.setBackgroundDrawable(new ColorDrawable(0));
    this.hEt.setOutsideTouchable(true);
    this.hEt.setFocusable(false);
    this.gIm.setOnClickListener(new bi(this));
  }

  private void aCK()
  {
    if (this.hFj != null)
    {
      int[] arrayOfInt = new int[2];
      this.hFj.getLocationOnScreen(arrayOfInt);
      int i = arrayOfInt[0] - (this.hEt.getWidth() - this.hFj.getWidth()) / 2;
      int j = arrayOfInt[1] - this.hEt.getHeight();
      this.hEt.showAtLocation(this.hFj, 0, i, j);
    }
  }

  public final void a(bl parambl)
  {
    this.hDw = parambl;
  }

  public final void ah(View paramView)
  {
    this.hFj = paramView;
  }

  public final boolean ak(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.hFn = paramString;
      String str = com.tencent.mm.pluginsdk.g.axR().lD(paramString);
      this.hEs = com.tencent.mm.pluginsdk.g.axR().ly(str);
    }
    return this.hEs != null;
  }

  public final void c(bb parambb)
  {
    this.hFm = parambb;
  }

  public final void hide()
  {
    if (this.hEt == null)
      return;
    this.hEt.dismiss();
  }

  public final void show()
  {
    if ((this.hEs == null) || (this.hxC == null) || (this.hEt == null) || (this.eET == null) || (this.hFh == null))
    {
      z.w("!44@/B4Tb64lLpJUej9RrA1bOcU7fPC/hAaH/rogzloCsig=", "some thing is null.");
      return;
    }
    this.hxC.h(this.hEs);
    aCK();
    new ay(new bj(this), false).cP(3000L);
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(0);
    arrayOfObject[1] = this.hFn;
    localn.d(10994, arrayOfObject);
  }

  public final void update()
  {
    if (this.hEt.isShowing())
    {
      this.hEt.dismiss();
      aCK();
    }
  }

  public final void vJ(String paramString)
  {
    z.d("!44@/B4Tb64lLpJUej9RrA1bOcU7fPC/hAaH/rogzloCsig=", "[checkIfShow]");
    if ((!ch.jb(paramString)) && (!paramString.equals(this.hFo)))
      am.h(new bk(this, paramString));
    this.hFo = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.bh
 * JD-Core Version:    0.6.2
 */