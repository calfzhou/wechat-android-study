package com.tencent.mm.ui.friend;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.c.a.cx;
import com.tencent.mm.c.a.cz;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.m;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.MaskLayout;
import java.util.List;

public final class f extends RelativeLayout
{
  private Context context = null;
  private View erf = null;
  private boolean flP = true;
  private View jHW = null;
  private final ay jHX = new ay(new g(this), true);
  private al jHY = new h(this);
  private boolean jHZ = false;

  public f(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    com.tencent.mm.aj.l.AF().g(this.jHY);
    aYD();
    init();
  }

  private static void aYD()
  {
    int i = com.tencent.mm.aj.l.AF().Aw();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    z.v("!44@/B4Tb64lLpISOYcLaKm7W93grpYn2xfC5yJeWqznlqY=", "updateAddressTabUnread, newCount update to = %d", arrayOfObject);
    if (i > 0)
      bg.qW().oQ().set(143618, Integer.valueOf(i));
  }

  private void init()
  {
    List localList = com.tencent.mm.aj.l.AF().Au();
    int i = localList.size();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i);
    z.d("!44@/B4Tb64lLpISOYcLaKm7W93grpYn2xfC5yJeWqznlqY=", "init new fconv size = %d (max is 4)", arrayOfObject1);
    removeAllViews();
    View localView;
    if (i <= 0)
    {
      this.erf = View.inflate(this.context, com.tencent.mm.k.bfH, this);
      this.jHW = this.erf.findViewById(com.tencent.mm.i.auf);
      this.erf.setOnClickListener(new j(this));
      MaskLayout localMaskLayout5 = (MaskLayout)this.erf.findViewById(com.tencent.mm.i.atR);
      af.sh();
      Bitmap localBitmap = m.eW("fmessage");
      ((ImageView)localMaskLayout5.getContentView()).setImageBitmap(localBitmap);
      localView = this.erf.findViewById(com.tencent.mm.i.atW);
      if (localView != null)
        if (!this.flP)
          break label1101;
    }
    int k;
    TextView localTextView1;
    label803: label1101: for (int m = 0; ; m = 8)
    {
      localView.setVisibility(m);
      this.jHW.setOnTouchListener(new i(this));
      k = com.tencent.mm.aj.l.AF().Aw();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(k);
      z.d("!44@/B4Tb64lLpISOYcLaKm7W93grpYn2xfC5yJeWqznlqY=", "init totalNewSize = %d", arrayOfObject3);
      localTextView1 = (TextView)this.erf.findViewById(com.tencent.mm.i.aud);
      if (k > 0)
        break label1108;
      localTextView1.setVisibility(8);
      return;
      if (i == 1)
      {
        com.tencent.mm.aj.a locala5 = (com.tencent.mm.aj.a)localList.get(0);
        this.erf = View.inflate(this.context, com.tencent.mm.k.bfJ, this);
        ((TextView)this.erf.findViewById(com.tencent.mm.i.aui)).setText(com.tencent.mm.ar.b.e(this.context, locala5.field_displayName, -1));
        TextView localTextView2 = (TextView)this.erf.findViewById(com.tencent.mm.i.auh);
        com.tencent.mm.aj.f localf = com.tencent.mm.aj.l.AE().hJ(locala5.field_talker);
        Context localContext = this.context;
        int n = localf.field_type;
        int i1 = locala5.field_addScene;
        String str = localf.field_msgContent;
        int i2 = localf.field_isSend;
        Object[] arrayOfObject4 = new Object[4];
        arrayOfObject4[0] = Integer.valueOf(n);
        arrayOfObject4[1] = Integer.valueOf(i1);
        arrayOfObject4[2] = str;
        arrayOfObject4[3] = Integer.valueOf(i2);
        z.d("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "getDigest, fmsgType = %d, fmsgScene = %d, fmsgContent = %s, isSend = %d", arrayOfObject4);
        if (n == 0)
          if (str == null)
          {
            z.e("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "getDigest fail, fmsgContent is null");
            str = null;
            if (!ap.jb(str))
              break label803;
            localTextView2.setVisibility(8);
          }
        while (true)
        {
          this.jHW = this.erf.findViewById(com.tencent.mm.i.atW);
          this.erf.setOnClickListener(new k(this));
          c.a((ImageView)((MaskLayout)this.erf.findViewById(com.tencent.mm.i.atR)).getContentView(), locala5.field_talker);
          break;
          as localas = as.zl(str);
          switch (localas.Ew())
          {
          default:
            str = localContext.getString(n.byX);
            break;
          case 4:
            str = localContext.getString(n.byN);
            break;
          case 10:
          case 11:
            cx localcx = new cx();
            localcx.cJk.cJh = localas.aJS();
            localcx.cJk.cJi = localas.aJV();
            com.tencent.mm.sdk.c.a.aGB().g(localcx);
            int i3 = n.byT;
            Object[] arrayOfObject5 = new Object[1];
            arrayOfObject5[0] = ch.Y(localcx.cJl.cJm, "");
            str = localContext.getString(i3, arrayOfObject5);
            break;
          case 31:
            str = localContext.getString(n.bze);
            break;
          case 32:
            str = localContext.getString(n.byY);
            break;
          case 58:
          case 59:
          case 60:
            str = localContext.getString(n.byR);
            break;
            if (i2 == 1)
              break;
            av localav = av.zp(str);
            if ((localav.getContent() != null) && (!localav.getContent().trim().equals("")))
            {
              str = localav.getContent();
              break;
            }
            str = localContext.getString(n.bJP);
            break;
            localTextView2.setText(str);
          }
        }
      }
      this.erf = View.inflate(this.context, com.tencent.mm.k.bfI, this);
      int j = localList.size();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(j);
      z.d("!44@/B4Tb64lLpISOYcLaKm7W93grpYn2xfC5yJeWqznlqY=", "initMultiNew, newList size = %d", arrayOfObject2);
      com.tencent.mm.aj.a locala1 = (com.tencent.mm.aj.a)localList.get(0);
      MaskLayout localMaskLayout1 = (MaskLayout)this.erf.findViewById(com.tencent.mm.i.atR);
      c.a((ImageView)localMaskLayout1.getContentView(), locala1.field_talker);
      localMaskLayout1.setVisibility(0);
      com.tencent.mm.aj.a locala2 = (com.tencent.mm.aj.a)localList.get(1);
      MaskLayout localMaskLayout2 = (MaskLayout)this.erf.findViewById(com.tencent.mm.i.atS);
      c.a((ImageView)localMaskLayout2.getContentView(), locala2.field_talker);
      localMaskLayout2.setVisibility(0);
      if (j > 2)
      {
        com.tencent.mm.aj.a locala4 = (com.tencent.mm.aj.a)localList.get(2);
        MaskLayout localMaskLayout4 = (MaskLayout)this.erf.findViewById(com.tencent.mm.i.atT);
        c.a((ImageView)localMaskLayout4.getContentView(), locala4.field_talker);
        localMaskLayout4.setVisibility(0);
      }
      if (j > 3)
      {
        com.tencent.mm.aj.a locala3 = (com.tencent.mm.aj.a)localList.get(3);
        MaskLayout localMaskLayout3 = (MaskLayout)this.erf.findViewById(com.tencent.mm.i.atU);
        c.a((ImageView)localMaskLayout3.getContentView(), locala3.field_talker);
        localMaskLayout3.setVisibility(0);
      }
      this.jHW = this.erf.findViewById(com.tencent.mm.i.atW);
      this.jHW.setOnClickListener(new l(this));
      break;
    }
    label1108: localTextView1.setVisibility(0);
    if (k > 99)
    {
      localTextView1.setText(getContext().getString(n.cmN));
      return;
    }
    localTextView1.setText(String.valueOf(k));
  }

  public final void detach()
  {
    if (bg.oE())
      com.tencent.mm.aj.l.AF().h(this.jHY);
  }

  public final void fL(boolean paramBoolean)
  {
    this.jHZ = paramBoolean;
  }

  public final void setVisible(boolean paramBoolean)
  {
    z.d("!44@/B4Tb64lLpISOYcLaKm7W93grpYn2xfC5yJeWqznlqY=", "setVisible visible = " + paramBoolean);
    View localView = this.erf.findViewById(com.tencent.mm.i.atW);
    if (localView != null)
      if (!paramBoolean)
        break label54;
    label54: for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      this.flP = paramBoolean;
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.f
 * JD-Core Version:    0.6.2
 */