package com.tencent.mm.ui.voicesearch;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.fi;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.dy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class j extends cb
  implements com.tencent.mm.o.m
{
  private int cCB = 1;
  private Context context;
  private LinkedList dRV = new LinkedList();
  private ProgressDialog dWT = null;
  private com.tencent.mm.ui.applet.b dtE = new com.tencent.mm.ui.applet.b(new k(this));
  private com.tencent.mm.ui.applet.f dtF = null;
  private List edM = null;
  private String gpG;
  private boolean jZA = true;
  private boolean jZB = false;
  private boolean jZC = false;
  private boolean jZy = false;
  private com.tencent.mm.storage.i jZz = null;
  private String[] jmD;
  private String jwY;

  public j(Context paramContext, int paramInt)
  {
    super(paramContext, new com.tencent.mm.storage.i());
    this.context = paramContext;
    this.jZz = new com.tencent.mm.storage.i();
    this.jZz.setUsername("_find_more_public_contact_");
    this.jZz.tD();
    this.jwY = "@micromsg.with.all.biz.qq.com";
    this.cCB = paramInt;
  }

  private void w(Runnable paramRunnable)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramRunnable.run();
      notifyDataSetChanged();
      return;
    }
    am.h(new n(this, paramRunnable));
  }

  public final void DW()
  {
    w(new s(this));
  }

  protected final void DX()
  {
    closeCursor();
    DW();
  }

  public final void Dx(String paramString)
  {
    this.jwY = paramString;
  }

  public final void Dy(String paramString)
  {
    w(new q(this, paramString));
  }

  public final boolean Dz(String paramString)
  {
    if ((this.edM != null) && (paramString != null))
    {
      Iterator localIterator = this.edM.iterator();
      while (localIterator.hasNext())
        if (((String)localIterator.next()).equals(paramString))
          return false;
    }
    return true;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramx.getType() != 106)
    {
      z.e("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "error type");
      return;
    }
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    this.jZC = false;
    if (dy.a(this.context, paramInt1, paramInt2, paramString, 7))
    {
      this.jZA = false;
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -4))
    {
      w(new u(this));
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w(new l(this));
      return;
    }
    w(new m(this, paramx));
  }

  protected final int apd()
  {
    boolean bool1 = this.jZy;
    int i = 0;
    int j;
    if (bool1)
    {
      boolean bool2 = this.jZz.isHidden();
      j = 0;
      if (!bool2)
        break label33;
    }
    while (true)
    {
      i = j + 1;
      return i;
      label33: j = this.dRV.size();
    }
  }

  public final void bc(List paramList)
  {
    w(new o(this, paramList));
  }

  public final boolean bcb()
  {
    return this.jZB;
  }

  public final void bn(List paramList)
  {
    this.jmD = ((String[])paramList.toArray(new String[paramList.size()]));
    this.gpG = null;
    closeCursor();
    DW();
  }

  public final void detach()
  {
    if (this.dtE != null)
    {
      this.dtE.detach();
      this.dtE = null;
    }
  }

  public final int getItemViewType(int paramInt)
  {
    if (this.cCB == 2)
      return 2;
    if (rz(paramInt))
      return 1;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool1 = oL(paramInt);
    boolean bool2 = rz(paramInt);
    if ((this.jZy) && (bool1))
    {
      if (paramView != null)
      {
        v localv6 = (v)paramView.getTag();
        if ((bool2) && (localv6.jZG == null))
          paramView = null;
      }
      v localv5;
      if (paramView == null)
        if (bool2)
        {
          paramView = View.inflate(this.context, com.tencent.mm.k.bdx, null);
          localv5 = new v();
          localv5.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.aoD));
          localv5.jZG = ((ProgressBar)paramView.findViewById(com.tencent.mm.i.aNz));
          paramView.setTag(localv5);
        }
      while (!bool2)
      {
        if (this.dtF == null)
          this.dtF = new r(this);
        if (this.dtE != null)
          this.dtE.a(-1 + (paramInt - aPA()), this.dtF);
        wz localwz = rx(paramInt);
        localv5.egz.setVisibility(8);
        if (localwz == null)
        {
          return paramView;
          paramView = View.inflate(this.context, com.tencent.mm.k.bdB, null);
          localv5 = new v();
          localv5.egz = ((TextView)paramView.findViewById(com.tencent.mm.i.aoA));
          localv5.eoy = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.aoy));
          localv5.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.aoD));
          localv5.egC = ((CheckBox)paramView.findViewById(com.tencent.mm.i.aoE));
          localv5.jAE = ((TextView)paramView.findViewById(com.tencent.mm.i.aow));
          paramView.setTag(localv5);
          continue;
          localv5 = (v)paramView.getTag();
        }
        else
        {
          localv5.jAE.setVisibility(8);
          c.a((ImageView)localv5.eoy.getContentView(), localwz.hVf.getString());
          if (localwz.ifO != 0)
          {
            String str4 = at.qz().cJ(localwz.ifO);
            if (str4 != null)
            {
              Bitmap localBitmap2 = com.tencent.mm.q.v.fJ(str4);
              localv5.eoy.b(localBitmap2, fi.jdH);
            }
          }
          while (true)
          {
            String str3 = ch.ja(localwz.ifj.getString());
            try
            {
              TextView localTextView4 = localv5.egA;
              localTextView4.setText(com.tencent.mm.ar.b.e(this.context, str3, (int)localv5.egA.getTextSize()));
              return paramView;
            }
            catch (Exception localException3)
            {
              localv5.egA.setText("");
              return paramView;
            }
            localv5.eoy.aTa();
            continue;
            localv5.eoy.aTa();
          }
        }
      }
      if (this.jZC)
        localv5.jZG.setVisibility(0);
      while (true)
      {
        z.d("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "refresh  " + this.jZA);
        if (((this.dRV != null) && (this.dRV.size() != 0)) || (this.jZA))
          break;
        localv5.egA.setText(this.context.getString(com.tencent.mm.n.bsj));
        localv5.egA.setTextColor(this.context.getResources().getColor(com.tencent.mm.f.On));
        return paramView;
        localv5.jZG.setVisibility(8);
      }
      localv5.egA.setText(this.context.getString(com.tencent.mm.n.bsk));
      localv5.egA.setTextColor(a.m(this.context, com.tencent.mm.f.Ou));
      return paramView;
    }
    if (this.cCB == 2)
    {
      v localv3;
      if (paramView == null)
      {
        paramView = View.inflate(this.context, com.tencent.mm.k.bpb, null);
        v localv4 = new v();
        localv4.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.aoD));
        paramView.setTag(localv4);
        localv3 = localv4;
      }
      while (true)
      {
        com.tencent.mm.storage.i locali2 = ry(paramInt);
        localv3.egA.setTextColor(a.m(this.context, com.tencent.mm.f.Ou));
        try
        {
          Context localContext2 = this.context;
          int j = com.tencent.mm.n.cok;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = y.a(locali2, locali2.getUsername());
          String str2 = localContext2.getString(j, arrayOfObject);
          TextView localTextView3 = localv3.egA;
          localTextView3.setText(com.tencent.mm.ar.b.e(this.context, str2, (int)localv3.egA.getTextSize()));
          localv3.egA.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          return paramView;
          localv3 = (v)paramView.getTag();
        }
        catch (Exception localException2)
        {
          while (true)
            localv3.egA.setText("");
        }
      }
    }
    v localv1;
    View localView1;
    if (paramView != null)
    {
      localv1 = (v)paramView.getTag();
      if (localv1 == null)
        localView1 = null;
    }
    while (true)
    {
      View localView2;
      v localv2;
      if (localView1 == null)
      {
        localView2 = View.inflate(this.context, com.tencent.mm.k.bdB, null);
        localv2 = new v();
        localv2.egz = ((TextView)localView2.findViewById(com.tencent.mm.i.aoA));
        localv2.eoy = ((MaskLayout)localView2.findViewById(com.tencent.mm.i.aoy));
        localv2.egA = ((TextView)localView2.findViewById(com.tencent.mm.i.aoD));
        localv2.egC = ((CheckBox)localView2.findViewById(com.tencent.mm.i.aoE));
        localv2.jAE = ((TextView)localView2.findViewById(com.tencent.mm.i.aow));
        localView2.setTag(localv2);
      }
      while (true)
      {
        com.tencent.mm.storage.i locali1 = ry(paramInt);
        if (localv2.egz != null)
          localv2.egz.setVisibility(8);
        TextView localTextView1 = localv2.egA;
        Context localContext1 = this.context;
        int i;
        if (!y.dP(locali1.getUsername()))
          i = com.tencent.mm.f.Ou;
        while (true)
        {
          localTextView1.setTextColor(a.m(localContext1, i));
          c.a((ImageView)localv2.eoy.getContentView(), locali1.getUsername());
          localv2.jAE.setVisibility(8);
          if (locali1.jd() != 0)
          {
            String str1 = at.qz().cJ(locali1.jd());
            if (str1 != null)
            {
              Bitmap localBitmap1 = com.tencent.mm.q.v.fJ(str1);
              localv2.eoy.b(localBitmap1, fi.jdH);
            }
          }
          try
          {
            while (true)
            {
              TextView localTextView2 = localv2.egA;
              localTextView2.setText(com.tencent.mm.ar.b.e(this.context, y.a(locali1, locali1.getUsername()), (int)localv2.egA.getTextSize()));
              return localView2;
              i = com.tencent.mm.f.Ov;
              break;
              localv2.eoy.aTa();
              continue;
              localv2.eoy.aTa();
            }
          }
          catch (Exception localException1)
          {
            while (true)
              localv2.egA.setText("");
          }
        }
        localView2 = localView1;
        localv2 = localv1;
      }
      localView1 = paramView;
      continue;
      localView1 = paramView;
      localv1 = null;
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final void gm(boolean paramBoolean)
  {
    this.jZB = paramBoolean;
    if (paramBoolean)
      this.jZz.tD();
  }

  public final void gn(boolean paramBoolean)
  {
    w(new p(this, paramBoolean));
  }

  public final boolean isEnabled(int paramInt)
  {
    return (!rz(paramInt)) || ((this.dRV != null) && (this.dRV.size() != 0)) || (this.jZA);
  }

  public final void jI(String paramString)
  {
    String str = paramString.trim();
    if (str.startsWith("@"))
      str = str.substring(1) + "%@micromsg.with.all.biz.qq.com";
    z.d("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "translateQueryText [" + str + "]");
    if ((str != null) && (!str.equals(this.gpG)))
      w(new t(this));
    this.gpG = str;
    this.jmD = null;
    if (this.gpG == null)
      this.gpG = "";
    closeCursor();
    DW();
  }

  public final void onPause()
  {
    bg.qX().b(106, this);
  }

  public final void onResume()
  {
    bg.qX().a(106, this);
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.dtE != null)
      this.dtE.onTouchEvent(paramMotionEvent);
  }

  public final wz rx(int paramInt)
  {
    try
    {
      z.d("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "position " + paramInt + " size " + this.dRV.size() + "  " + (paramInt - aPA()));
      wz localwz = (wz)this.dRV.get(-1 + (paramInt - aPA()));
      return localwz;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final com.tencent.mm.storage.i ry(int paramInt)
  {
    if (oL(paramInt))
      return (com.tencent.mm.storage.i)aPB();
    return (com.tencent.mm.storage.i)super.getItem(paramInt);
  }

  public final boolean rz(int paramInt)
  {
    if (this.jZy)
    {
      int i = aPA();
      if ((paramInt == i) && (paramInt < i + apd()))
        return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.j
 * JD-Core Version:    0.6.2
 */