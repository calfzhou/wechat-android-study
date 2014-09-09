package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.n.c;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.aw;

final class dt extends cl
{
  public dt()
  {
    super(9);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcz);
      paramView.setTag(new mo(this.fjl).aB(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    mo localmo = (mo)paramck;
    av localav;
    if (paramar.getType() == 37)
    {
      localav = bg.qW().oV().zC(paramar.getContent());
      if ((localav == null) || (localav.aJQ() == null) || (localav.aJQ().length() <= 0))
      {
        z.e("!56@/B4Tb64lLpKwUcOR+EdWcgRPJHTUmmwwMVwSNnsFRrIoDzelZqer5g==", "getView : parse verify msg failed");
        return;
      }
      c.k(localav.aJQ(), localav.aJR());
      if (y.di(localav.aJQ()))
      {
        localmo.juN.setVisibility(8);
        localmo.juO.setVisibility(8);
        localmo.juP.setVisibility(0);
        localmo.juM.setBackgroundColor(16777215);
        localmo.juP.setText(paramhd.getString(n.bLB));
        switch (localav.Ew())
        {
        case 14:
        case 15:
        case 16:
        case 17:
        case 19:
        case 20:
        case 21:
        default:
          label236: localmo.jmV.setText(n.bzb);
          label247: TextView localTextView6 = localmo.iRd;
          localTextView6.setText(com.tencent.mm.ar.b.e(paramhd.agh(), localav.getDisplayName(), (int)localmo.iRd.getTextSize()));
          h(localmo.egy, localav.aJQ());
          localmo.jpB.setVisibility(0);
          if ((localav.getContent() != null) && (!localav.getContent().trim().equals("")))
            localmo.jpB.setText(localav.getContent());
          break;
        case 18:
        case 22:
        case 23:
        case 24:
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
        case 25:
        case 13:
        }
      }
    }
    while (true)
    {
      localmo.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
      localmo.joC.setOnClickListener(paramhd.joh.jqc);
      localmo.joC.setOnLongClickListener(paramhd.joh.jqe);
      return;
      localmo.juN.setVisibility(0);
      localmo.juO.setVisibility(0);
      localmo.juP.setVisibility(0);
      localmo.juM.setBackgroundResource(h.Zt);
      localmo.juP.setText(paramhd.getString(n.bLA));
      break;
      localmo.jmV.setText(n.bzf);
      break label247;
      localmo.jmV.setText(n.bzh);
      break label247;
      localmo.jmV.setText(n.bWQ);
      break label247;
      localmo.jmV.setText(n.bza);
      break label247;
      i locali = az.wZ().gl(localav.aJQ());
      if ((locali.vw() != null) && (!locali.vw().equals("")))
      {
        localmo.juQ.setVisibility(0);
        TextView localTextView7 = localmo.juQ;
        int i = n.byT;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = locali.vw();
        localTextView7.setText(paramhd.getString(i, arrayOfObject));
        break label236;
      }
      localmo.juQ.setVisibility(8);
      break label236;
      localmo.jpB.setText(paramhd.getString(n.bzg));
      continue;
      if (paramar.getType() == 40)
      {
        as localas = bg.qW().oV().zD(paramar.getContent());
        if ((localas == null) || (localas.aJQ() == null) || (localas.aJQ().length() <= 0))
        {
          z.e("!56@/B4Tb64lLpKwUcOR+EdWcgRPJHTUmmwwMVwSNnsFRrIoDzelZqer5g==", "getView : parse possible friend msg failed");
          return;
        }
        c.k(localas.aJQ(), localas.aJR());
        if (y.di(localas.aJQ()))
        {
          localmo.juN.setVisibility(8);
          localmo.juO.setVisibility(8);
          localmo.juP.setVisibility(0);
          localmo.juM.setBackgroundColor(16777215);
          localmo.juP.setText(paramhd.getString(n.bLB));
          label768: switch (localas.Ew())
          {
          default:
            localmo.jmV.setText(n.byW);
            localmo.jpB.setText(n.byX);
            TextView localTextView5 = localmo.iRd;
            localTextView5.setText(com.tencent.mm.ar.b.e(paramhd.agh(), localas.getDisplayName(), (int)localmo.iRd.getTextSize()));
          case 4:
          case 10:
          case 11:
          case 31:
          case 32:
          }
        }
        while (true)
        {
          h(localmo.egy, localas.aJQ());
          break;
          localmo.juN.setVisibility(0);
          localmo.juO.setVisibility(0);
          localmo.juP.setVisibility(0);
          localmo.juM.setBackgroundResource(h.Zt);
          localmo.juP.setText(paramhd.getString(n.bLA));
          break label768;
          localmo.jmV.setText(n.byM);
          localmo.jpB.setText(n.byN);
          String str2 = localas.aJU();
          if (str2 == null)
            str2 = localas.getDisplayName();
          TextView localTextView4 = localmo.iRd;
          localTextView4.setText(com.tencent.mm.ar.b.e(paramhd.agh(), str2, (int)localmo.iRd.getTextSize()));
          continue;
          localmo.jmV.setText(n.byS);
          String str1 = aa.gw(localas.aJS());
          if (ap.jb(str1))
            str1 = aa.gw(localas.aJV());
          localmo.jpB.setText(paramhd.getString(n.byT, new Object[] { str1 }));
          TextView localTextView3 = localmo.iRd;
          localTextView3.setText(com.tencent.mm.ar.b.e(paramhd.agh(), localas.getDisplayName(), (int)localmo.iRd.getTextSize()));
          continue;
          localmo.jmV.setText(n.bzd);
          localmo.jpB.setText(n.bze);
          TextView localTextView2 = localmo.iRd;
          localTextView2.setText(com.tencent.mm.ar.b.e(paramhd.agh(), localas.getDisplayName(), (int)localmo.iRd.getTextSize()));
          continue;
          localmo.jmV.setText(n.byZ);
          localmo.jpB.setText(n.byY);
          TextView localTextView1 = localmo.iRd;
          localTextView1.setText(com.tencent.mm.ar.b.e(paramhd.agh(), localas.getDisplayName(), (int)localmo.iRd.getTextSize()));
        }
      }
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcgRPJHTUmmwwMVwSNnsFRrIoDzelZqer5g==", "FROM_FMESSAGE did not include this type, msgType = " + paramar.getType());
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }

  protected final boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dt
 * JD-Core Version:    0.6.2
 */