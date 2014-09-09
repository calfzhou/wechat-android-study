package com.tencent.mm.pluginsdk.ui.applet;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.p;
import com.tencent.mm.o.ac;
import com.tencent.mm.q.aa;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.e;

public final class j
  implements p, h
{
  private int eBp;
  private String epd;
  private ProgressDialog eyO;
  private com.tencent.mm.storage.i fDi;
  private o hAP;
  private cn hAQ;
  private com.tencent.mm.o.m hAR = null;
  private Context mContext;

  public j(Context paramContext, String paramString, int paramInt, o paramo)
  {
    this.mContext = paramContext;
    this.epd = paramString;
    this.eBp = paramInt;
    this.hAP = paramo;
  }

  private void B(com.tencent.mm.storage.i parami)
  {
    if (parami == null)
    {
      z.e("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "showContact fail, contact is null");
      mx(-1);
    }
    do
    {
      return;
      String str1 = this.mContext.getString(com.tencent.mm.n.cuc);
      Bitmap localBitmap = c.a(parami.getUsername(), false, -1);
      if (localBitmap == null)
        af.sh().a(this);
      if ((localBitmap != null) && (parami.aIg()))
        localBitmap = com.tencent.mm.sdk.platformtools.i.a(localBitmap, false, localBitmap.getWidth() / 2);
      String str2 = parami.iV();
      this.hAQ = null;
      if ((this.mContext instanceof MMActivity))
        this.hAQ = r.a(((MMActivity)this.mContext).aPC(), str1, localBitmap, str2, "", com.tencent.mm.n.bBc, parami.aIg(), new k(this, parami));
    }
    while (this.hAQ != null);
    z.e("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "showContact fail, cannot show dialog");
    mx(-1);
  }

  private void mx(int paramInt)
  {
    if (this.hAP != null)
      this.hAP.md(paramInt);
  }

  private void vx(String paramString)
  {
    z.i("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "searchContact %s", new Object[] { paramString });
    if (this.hAR == null)
      this.hAR = new m(this);
    bg.qX().a(106, this.hAR);
    al localal = new al(paramString);
    bg.qX().d(localal);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    if (this.eyO != null)
      this.eyO.dismiss();
    if (paramBoolean1)
    {
      this.fDi.oz();
      bg.qW().oT().a(this.fDi.getUsername(), this.fDi);
      e.aw(this.mContext, this.mContext.getResources().getString(com.tencent.mm.n.cug));
      mx(1);
      return;
    }
    mx(-1);
  }

  public final void eX(String paramString)
  {
    int i = 1;
    int j;
    if (this.fDi != null)
      if ((this.fDi.getUsername() != null) && (this.fDi.getUsername().equals(paramString)))
      {
        j = i;
        if ((this.fDi.iS() == null) || (!this.fDi.iS().equals(paramString)))
          break label73;
        label59: if ((j != 0) || (i != 0))
          break label96;
      }
    label73: label96: 
    while ((this.hAQ == null) || (!this.hAQ.isShowing()))
      do
      {
        return;
        j = 0;
        break;
        i = 0;
        break label59;
      }
      while ((this.epd == null) || (!this.epd.equals(paramString)));
    am.h(new l(this));
  }

  public final void show()
  {
    this.fDi = bg.qW().oT().ys(this.epd);
    if ((this.fDi != null) && ((int)this.fDi.dhv > 0))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.epd;
      z.i("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "dealAddContact get by username fail, try alias, %s", arrayOfObject);
      this.fDi = bg.qW().oT().yp(this.epd);
    }
    if ((this.fDi != null) && ((int)this.fDi.dhv > 0))
    {
      z.i("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "get by alias fail, dealAddContact");
      if (this.fDi == null)
      {
        z.e("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "dealAddContact fail, contact is null");
        mx(-1);
      }
      Bitmap localBitmap;
      do
      {
        return;
        String str = this.fDi.getUsername();
        if (this.fDi.aIg())
          break;
        if (aa.uY().fz(str).ub())
        {
          Context localContext2 = this.mContext;
          this.mContext.getString(com.tencent.mm.n.buo);
          this.eyO = e.a(localContext2, this.mContext.getString(com.tencent.mm.n.cud), true, null);
          vx(str);
          return;
        }
        localBitmap = BitmapFactory.decodeResource(this.mContext.getResources(), com.tencent.mm.h.Ul);
      }
      while ((!(this.mContext instanceof MMActivity)) || (r.a(((MMActivity)this.mContext).aPC(), localBitmap, this.mContext.getResources().getString(com.tencent.mm.n.cui), new n(this)) != null));
      z.e("!44@/B4Tb64lLpKN6K/THdLZyfhssx5i4XqJeW6IFVaMNdw=", "dealAddContact fail, connot show dialog");
      mx(-1);
      return;
      if (com.tencent.mm.g.a.cv(this.fDi.getType()))
      {
        e.aw(this.mContext, this.mContext.getResources().getString(com.tencent.mm.n.cug));
        mx(-2);
        return;
      }
      B(this.fDi);
      return;
    }
    Context localContext1 = this.mContext;
    this.mContext.getString(com.tencent.mm.n.buo);
    this.eyO = e.a(localContext1, this.mContext.getString(com.tencent.mm.n.cud), true, null);
    vx(this.epd);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.j
 * JD-Core Version:    0.6.2
 */