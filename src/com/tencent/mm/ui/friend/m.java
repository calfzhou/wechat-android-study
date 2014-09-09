package com.tencent.mm.ui.friend;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.g;
import com.tencent.mm.aj.l;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.di;
import com.tencent.mm.ui.base.dj;
import com.tencent.mm.ui.base.dl;
import com.tencent.mm.ui.base.dm;
import com.tencent.mm.ui.cb;

public final class m extends cb
{
  private Context context;
  protected di ekA;
  protected dl ekB;
  protected dj ekC = new n(this);
  protected dm ekz;
  private View.OnClickListener jIb = new q(this);
  private View.OnClickListener jIc = new s(this);

  public m(Context paramContext)
  {
    super(paramContext, new com.tencent.mm.aj.a());
    this.context = paramContext;
  }

  public final void DW()
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      setCursor(l.AF().yF());
      notifyDataSetChanged();
      return;
    }
    am.h(new p(this));
  }

  protected final void DX()
  {
    closeCursor();
    DW();
  }

  public final void a(di paramdi)
  {
    this.ekA = paramdi;
  }

  public final void a(dl paramdl)
  {
    this.ekB = paramdl;
  }

  public final void a(dm paramdm)
  {
    this.ekz = paramdm;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    v localv;
    if (paramView == null)
    {
      MMSlideDelView localMMSlideDelView = (MMSlideDelView)View.inflate(this.context, k.bbz, null);
      View localView2 = View.inflate(this.context, k.bfK, null);
      localv = new v();
      localv.jIi = ((MaskLayout)localView2.findViewById(com.tencent.mm.i.atY));
      localv.gGk = ((TextView)localView2.findViewById(com.tencent.mm.i.aub));
      localv.jIn = ((TextView)localView2.findViewById(com.tencent.mm.i.atZ));
      localv.jIj = ((Button)localView2.findViewById(com.tencent.mm.i.atV));
      localv.jIj.setOnClickListener(this.jIb);
      localv.jIk = ((Button)localView2.findViewById(com.tencent.mm.i.aue));
      localv.jIk.setOnClickListener(this.jIc);
      localv.jIl = ((TextView)localView2.findViewById(com.tencent.mm.i.auc));
      localv.jIm = ((TextView)localView2.findViewById(com.tencent.mm.i.atX));
      localv.ekJ = localMMSlideDelView.findViewById(com.tencent.mm.i.aQo);
      localv.ekK = ((TextView)localMMSlideDelView.findViewById(com.tencent.mm.i.aQp));
      localMMSlideDelView.setView(localView2);
      localMMSlideDelView.a(this.ekz);
      localMMSlideDelView.a(this.ekA);
      localMMSlideDelView.a(this.ekC);
      localMMSlideDelView.aSv();
      localMMSlideDelView.setTag(localv);
      paramView = localMMSlideDelView;
    }
    com.tencent.mm.aj.a locala;
    f localf2;
    while (true)
    {
      locala = (com.tencent.mm.aj.a)getItem(paramInt);
      c.a((ImageView)localv.jIi.getContentView(), locala.field_talker);
      localv.gGk.setText(com.tencent.mm.ar.b.e(this.context, locala.field_displayName, -1));
      if (locala.field_fmsgSysRowId > 0L)
        break label619;
      z.w("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "getView, fconv fmsgSysRowId is invalid, try getLastFmsg");
      localf2 = l.AE().hJ(locala.field_talker);
      if (localf2 != null)
        break;
      z.e("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "getView, lastFmsg is null, talker = " + locala.field_talker);
      localv.jIj.setVisibility(8);
      localv.jIk.setVisibility(8);
      localv.jIl.setVisibility(8);
      localv.jIm.setVisibility(8);
      localv.jIn.setVisibility(8);
      return paramView;
      localv = (v)paramView.getTag();
    }
    com.tencent.mm.pluginsdk.ui.preference.n localn = com.tencent.mm.pluginsdk.ui.preference.n.a(this.context, localf2);
    z.i("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "getView, lastFmsg talker = " + locala.field_talker);
    while (true)
    {
      if (locala.field_state == 1)
      {
        com.tencent.mm.storage.i locali = bg.qW().oT().ys(locala.field_talker);
        if ((locali != null) && ((int)locali.dhv != 0) && (!com.tencent.mm.g.a.cv(locali.getType())))
          l.AF().q(locala.field_talker, 0);
      }
      if (localn != null)
        break;
      z.e("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "getView, fProvider is null, talker = " + locala.field_talker);
      localv.jIj.setVisibility(8);
      localv.jIk.setVisibility(8);
      localv.jIl.setVisibility(8);
      localv.jIm.setVisibility(8);
      localv.jIn.setVisibility(8);
      return paramView;
      label619: localn = com.tencent.mm.pluginsdk.ui.preference.n.a(this.context, locala);
      z.i("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "getView, lastFmsg sysrowid = " + locala.field_fmsgSysRowId + ", talker = " + locala.field_talker);
    }
    localv.ekJ.setTag(locala.field_talker);
    localv.ekJ.setOnClickListener(new o(this));
    localn.gsc = locala.field_addScene;
    localv.jIn.setText(localn.djA);
    View localView1;
    switch (locala.field_state)
    {
    default:
      localv.jIj.setVisibility(8);
      localv.jIk.setVisibility(8);
      localv.jIl.setVisibility(8);
      localv.jIm.setVisibility(8);
      localView1 = paramView.findViewById(com.tencent.mm.i.aua);
      if (locala.field_isNew != 0)
        break;
    case 0:
    case 2:
    case 1:
    }
    for (int i = h.WO; ; i = h.Ui)
    {
      localView1.setBackgroundResource(i);
      return paramView;
      f localf1;
      int j;
      if (locala.field_fmsgSysRowId <= 0L)
      {
        z.w("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "getView, fmsgSysRowId invalid, try use lastRecvFmsg");
        localf1 = l.AE().hK(localn.username);
        if (localf1 == null)
        {
          j = 0;
          label867: if ((j != 0) && (j != 3))
            break label950;
          localv.jIj.setVisibility(0);
          localv.jIj.setTag(localn);
          localv.jIk.setVisibility(8);
        }
      }
      while (true)
      {
        localv.jIl.setVisibility(8);
        localv.jIm.setVisibility(8);
        break;
        j = localf1.field_type;
        break label867;
        j = locala.field_recvFmsgType;
        break label867;
        label950: localv.jIk.setVisibility(0);
        localv.jIk.setTag(localn);
        localv.jIj.setVisibility(8);
      }
      localv.jIl.setVisibility(0);
      localv.jIj.setVisibility(8);
      localv.jIk.setVisibility(8);
      localv.jIm.setVisibility(8);
      break;
      localv.jIm.setVisibility(0);
      localv.jIj.setVisibility(8);
      localv.jIk.setVisibility(8);
      localv.jIl.setVisibility(8);
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.m
 * JD-Core Version:    0.6.2
 */