package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.pluginsdk.ui.e;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.di;
import com.tencent.mm.ui.base.dj;
import com.tencent.mm.ui.base.dl;
import com.tencent.mm.ui.base.dm;
import com.tencent.mm.ui.cb;
import java.util.List;

public final class aj extends cb
{
  protected MMActivity cHh;
  private com.tencent.mm.ui.applet.b dtE = null;
  private com.tencent.mm.ui.applet.f dtF = null;
  protected List edM = null;
  protected di ekA;
  protected dj ekC = MMSlideDelView.aSu();
  protected dm ekz;
  protected dl frR;
  private e hBt;
  protected String jwY = null;

  public aj(Context paramContext, String paramString)
  {
    super(paramContext, new com.tencent.mm.storage.i());
    this.cHh = ((MMActivity)paramContext);
    this.jwY = paramString;
    this.dtE = new com.tencent.mm.ui.applet.b(new ak(this));
  }

  private String J(com.tencent.mm.storage.i parami)
  {
    if (parami.jc() == 31)
      return "";
    if (parami.jc() == 43)
      return this.cHh.getString(n.caw);
    return String.valueOf((char)parami.jc());
  }

  private void a(am paramam, int paramInt1, int paramInt2)
  {
    com.tencent.mm.storage.i locali = (com.tencent.mm.storage.i)getItem(paramInt1 + 1);
    if ((locali == null) || ((locali.jc() != paramInt2) && (!ap.jb(J(locali)))))
      paramam.jyn.setBackgroundResource(0);
  }

  public final void DW()
  {
    try
    {
      Cursor localCursor = bg.qW().oT().a(this.jwY, "", this.edM, false);
      closeCursor();
      setCursor(localCursor);
      notifyDataSetChanged();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(e parame)
  {
    this.hBt = parame;
  }

  public final void a(di paramdi)
  {
    this.ekA = paramdi;
  }

  public final void a(dl paramdl)
  {
    this.frR = paramdl;
  }

  public final void a(dm paramdm)
  {
    this.ekz = paramdm;
  }

  public final void detach()
  {
    if (this.dtE != null)
    {
      this.dtE.detach();
      this.dtE = null;
    }
  }

  public final int getCount()
  {
    return getCursor().getCount();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.dtF == null)
      this.dtF = new al(this);
    if (this.dtE != null)
      this.dtE.a(paramInt, this.dtF);
    am localam1;
    if (paramView == null)
    {
      paramView = View.inflate(this.cHh, k.bcd, null);
      am localam2 = new am();
      localam2.egz = ((TextView)paramView.findViewById(com.tencent.mm.i.aoA));
      localam2.eoy = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.aoy));
      localam2.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.aoD));
      localam2.jyn = ((ViewGroup)paramView.findViewById(com.tencent.mm.i.aoC));
      paramView.setTag(localam2);
      localam1 = localam2;
    }
    while (true)
    {
      com.tencent.mm.storage.i locali1 = (com.tencent.mm.storage.i)getItem(paramInt - 1);
      int i;
      label153: com.tencent.mm.storage.i locali2;
      String str2;
      label227: label246: int j;
      if (locali1 == null)
      {
        i = -1;
        locali2 = (com.tencent.mm.storage.i)getItem(paramInt);
        if (paramInt != 0)
          break label444;
        str2 = J(locali2);
        if (!ap.jb(str2))
          break label410;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = locali2.getUsername();
        arrayOfObject2[1] = Integer.valueOf(paramInt);
        z.w("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2Pv5tXEtMBlz8=", "get display show head return null, user[%s] pos[%d]", arrayOfObject2);
        localam1.egz.setVisibility(8);
        if (getItem(paramInt + 1) == null)
          localam1.jyn.setBackgroundResource(0);
        TextView localTextView1 = localam1.egA;
        MMActivity localMMActivity = this.cHh;
        if (y.dP(locali2.getUsername()))
          break label633;
        j = com.tencent.mm.f.Ou;
        localTextView1.setTextColor(com.tencent.mm.aq.a.m(localMMActivity, j));
        ImageView localImageView = (ImageView)localam1.eoy.getContentView();
        c.a(localImageView, locali2.getUsername());
        com.tencent.mm.pluginsdk.ui.a locala = (com.tencent.mm.pluginsdk.ui.a)localImageView.getDrawable();
        if (this.hBt != null)
          this.hBt.a(locala);
        localam1.eoy.aTa();
      }
      try
      {
        TextView localTextView2 = localam1.egA;
        localTextView2.setText(com.tencent.mm.ar.b.e(this.cHh, y.dh(locali2.getUsername()), (int)localam1.egA.getTextSize()));
        return paramView;
        localam1 = (am)paramView.getTag();
        continue;
        i = locali1.jc();
        break label153;
        label410: localam1.egz.setVisibility(0);
        localam1.egz.setText(str2);
        localam1.egz.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        break label227;
        label444: if ((paramInt > 0) && (locali2.jc() != i))
        {
          String str1 = J(locali2);
          localam1.jyn.setBackgroundResource(h.Uj);
          if (ap.jb(str1))
          {
            Object[] arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = locali2.getUsername();
            arrayOfObject1[1] = Integer.valueOf(paramInt);
            z.w("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2Pv5tXEtMBlz8=", "get display show head return null, user[%s] pos[%d]", arrayOfObject1);
            localam1.egz.setVisibility(8);
          }
          while (true)
          {
            a(localam1, paramInt, i);
            break;
            localam1.egz.setVisibility(0);
            localam1.egz.setText(str1);
            if (locali2.jc() == 32)
            {
              localam1.egz.setCompoundDrawablesWithIntrinsicBounds(h.WM, 0, 0, 0);
              localam1.egz.setCompoundDrawablePadding(2);
            }
            else
            {
              localam1.egz.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
          }
        }
        localam1.egz.setVisibility(8);
        a(localam1, paramInt, i);
        break label246;
        label633: j = com.tencent.mm.f.Ov;
      }
      catch (Exception localException)
      {
        localam1.egA.setText("");
      }
    }
    return paramView;
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.dtE != null)
      this.dtE.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.aj
 * JD-Core Version:    0.6.2
 */