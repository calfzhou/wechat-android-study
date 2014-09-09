package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.f.c;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.ad;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.MMFlipper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AppPanel extends LinearLayout
{
  private static int gfk = 215;
  private static int gfl = 158;
  private static boolean hCF = false;
  private Context context;
  private SharedPreferences dkI;
  private boolean dzC = false;
  private boolean gfv = false;
  private int gfw;
  private int gfx;
  private MMFlipper gfy;
  private MMDotView gfz;
  private int hCA = 0;
  private int hCB = 0;
  private boolean hCC = false;
  private final int hCD = 2;
  private e hCE = new h(this);
  private boolean hCG = true;
  private int hCH = -1;
  private int hCk = 10;
  private List hCn = new LinkedList();
  private final boolean[] hCt = new boolean[10];
  private l hCu;
  private m hCv;
  private List hCw;
  private int hCx = this.hCk;
  n hCy;
  private int hCz = 0;

  public AppPanel(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
  }

  public AppPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }

  private void aAY()
  {
    boolean bool = this.hCC;
    this.hCC = false;
    int i = this.hCB;
    new ArrayList();
    int j;
    if (com.tencent.mm.pluginsdk.g.axW() == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
      j = 0;
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(j);
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "serviceCount, %d", arrayOfObject);
      if (j > 0)
        this.hCC = true;
      if (bool != this.hCC)
      {
        this.hCy.dx(this.hCC);
        aBh();
      }
      return;
      Cursor localCursor = com.tencent.mm.pluginsdk.g.axW().aH(0, i);
      if (localCursor == null)
      {
        j = 0;
      }
      else
      {
        j = localCursor.getCount();
        localCursor.close();
      }
    }
  }

  private void aBh()
  {
    int i = 1;
    int j = this.hCt.length;
    for (int k = 0; k < j; k++)
      this.hCt[k] = i;
    if (!this.hCy.aBq())
      this.hCt[i] = false;
    while (true)
    {
      if (!this.hCy.aBs())
      {
        this.hCt[0] = false;
        i++;
      }
      if (!this.hCy.aBA())
      {
        this.hCt[2] = false;
        i++;
      }
      this.hCt[4] = false;
      int m = i + 1;
      if (!this.hCy.aBu())
      {
        this.hCt[3] = false;
        m++;
      }
      if (!this.hCy.aBw())
      {
        this.hCt[5] = false;
        m++;
      }
      if (!this.hCy.aBE())
      {
        this.hCt[9] = false;
        m++;
      }
      if ((!this.hCy.aBG()) || (!this.hCy.aBF()))
      {
        this.hCt[6] = false;
        m++;
      }
      if ((!this.hCy.aBz()) || (!this.hCy.aBy()))
      {
        this.hCt[7] = false;
        m++;
      }
      if (!this.hCy.aBH())
      {
        this.hCt[8] = false;
        m++;
      }
      this.hCk = (10 - m);
      return;
      i = 0;
    }
  }

  private int aBi()
  {
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() < localDisplay.getHeight())
      return 1;
    return 2;
  }

  private void aBj()
  {
    z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "AppPanel initFlipper");
    this.gfy.removeAllViews();
    this.gfy.a(new f(this));
    this.gfy.a(new g(this));
    aBl();
  }

  private void aBk()
  {
    if ((this.gfw == 0) || (this.gfx == 0))
      return;
    this.hCw = new ArrayList();
    this.gfy.removeAllViews();
    int i = com.tencent.mm.sdk.platformtools.e.a(this.context, 73.0F);
    int j = com.tencent.mm.sdk.platformtools.e.a(this.context, 90.0F);
    requestLayout();
    int k = this.gfw / i;
    int m = this.gfx / j;
    if (m > 2)
      m = 2;
    int n = (this.gfx - j * m) / (m + 1);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(n);
    z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "jacks spacing2 = %d", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(this.gfw);
    arrayOfObject2[1] = Integer.valueOf(this.gfx);
    z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "in initAppGrid, gridWidth = %d, gridHeight = %d", arrayOfObject2);
    if (k == 0)
      k = 1;
    if (m == 0)
      m = 1;
    int i1 = k * m;
    if (this.hCy.aBC());
    for (this.hCx = (this.hCk + this.hCn.size()); ; this.hCx = this.hCk)
    {
      int i2 = (int)Math.ceil(this.hCx / i1);
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(this.hCx);
      arrayOfObject3[1] = Integer.valueOf(i1);
      arrayOfObject3[2] = Integer.valueOf(i2);
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "in initAppGrid, totalItemCount = %d, itemsPerPage = %d, pageCount = %d", arrayOfObject3);
      for (int i3 = 0; i3 < i2; i3++)
      {
        AppGrid localAppGrid = (AppGrid)inflate(this.context, k.baR, null);
        localAppGrid.aW(this.hCn);
        localAppGrid.a(i3, this.hCx, i1, i2, k, this.hCk);
        localAppGrid.mI(n);
        this.gfy.addView(localAppGrid, new LinearLayout.LayoutParams(-1, -2));
        this.hCw.add(localAppGrid);
      }
    }
    if (this.hCw != null)
    {
      Iterator localIterator = this.hCw.iterator();
      while (localIterator.hasNext())
        ((AppGrid)localIterator.next()).a(this.hCE);
    }
    if (this.hCw.size() <= 1)
      this.gfz.setVisibility(4);
    while (true)
    {
      aBh();
      return;
      this.gfz.setVisibility(0);
      this.gfz.pt(this.hCw.size());
      int i4 = this.gfy.aRG();
      this.gfy.px(i4);
      this.gfz.pu(i4);
    }
  }

  public final void a(l paraml)
  {
    this.hCu = paraml;
  }

  public final void a(m paramm)
  {
    this.hCv = paramm;
  }

  public final void aAW()
  {
    this.hCy = new n();
    this.hCB = 0;
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() < localDisplay.getHeight())
    {
      this.hCz = localDisplay.getWidth();
      this.hCA = localDisplay.getHeight();
    }
    while (true)
    {
      View.inflate(this.context, k.baV, this);
      this.gfz = ((MMDotView)findViewById(i.agg));
      this.gfy = ((MMFlipper)findViewById(i.agh));
      try
      {
        String str = com.tencent.mm.f.e.or().getValue("ShowAPPSuggestion");
        if ((ch.jb(str)) || (Integer.valueOf(str).intValue() != 1));
        for (this.hCn = com.tencent.mm.pluginsdk.model.app.l.a(this.context, false, this.hCB); ; this.hCn = com.tencent.mm.pluginsdk.model.app.l.a(this.context, true, this.hCB))
        {
          aAY();
          aBj();
          aAZ();
          return;
          this.hCz = localDisplay.getHeight();
          this.hCA = localDisplay.getWidth();
          break;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localException.getMessage();
          z.e("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "exception in appPanel init, %s", arrayOfObject);
          this.hCn = com.tencent.mm.pluginsdk.model.app.l.a(this.context, false, this.hCB);
        }
      }
    }
  }

  public final void aAX()
  {
    this.hCB = 0;
  }

  public final void aAZ()
  {
    boolean bool1 = true;
    this.hCy.aBo();
    boolean bool2;
    if ((0x100000 & x.pO()) == 0)
    {
      bool2 = bool1;
      com.tencent.mm.f.e.os();
      if (com.tencent.mm.f.a.oa() == 2)
        break label73;
      bool1 = com.tencent.mm.am.a.aCl();
    }
    while (true)
    {
      this.hCy.dw(bool2);
      this.hCy.dA(bool1);
      this.hCy.dx(this.hCC);
      aBh();
      return;
      bool2 = false;
      break;
      label73: if ((0x400000 & x.pO()) != 0)
        bool1 = false;
    }
  }

  public final void aBa()
  {
    this.hCy.aBp();
    aBh();
  }

  public final void aBb()
  {
    this.hCy.aBr();
    aBh();
  }

  public final void aBc()
  {
    this.hCy.aBt();
    aBh();
  }

  public final void aBd()
  {
    this.hCy.aBv();
    aBh();
  }

  public final void aBe()
  {
    this.hCy.aBx();
    aBh();
  }

  public final void aBf()
  {
    this.hCy.aBB();
    aBh();
  }

  public final void aBg()
  {
    this.hCy.aBD();
    aBh();
  }

  public final void aBl()
  {
    if (this.hCG)
    {
      if (aBi() == 2)
      {
        z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "initFlipper, landscape");
        View localView2 = findViewById(i.agf);
        LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)localView2.getLayoutParams();
        localLayoutParams2.height = com.tencent.mm.sdk.platformtools.e.a(this.context, gfl);
        localLayoutParams2.width = this.hCA;
        localView2.setLayoutParams(localLayoutParams2);
      }
    }
    else
      return;
    this.hCG = false;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(gfk);
    z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "initFlipper, portrait: %d", arrayOfObject);
    View localView1 = findViewById(i.agf);
    LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
    if (this.hCH > 0);
    for (int i = this.hCH; ; i = com.tencent.mm.sdk.platformtools.e.a(this.context, gfk))
    {
      localLayoutParams1.height = i;
      localLayoutParams1.width = this.hCz;
      localView1.setLayoutParams(localLayoutParams1);
      return;
    }
  }

  public final void aqb()
  {
    if (this.gfy != null)
      this.gfy.px(0);
  }

  public final void bm(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void dr(boolean paramBoolean)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      this.hCy.dv(bool);
      aBh();
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "enable " + bool + " isVoipPluginEnable " + this.hCy.aBz());
      return;
    }
  }

  public final void ds(boolean paramBoolean)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      this.hCy.dz(bool);
      aBh();
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "enable " + this.hCy.aBG() + " isVoipAudioEnable " + bool);
      return;
    }
  }

  public final void dt(boolean paramBoolean)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      this.hCy.dB(bool);
      aBh();
      return;
    }
  }

  public final void du(boolean paramBoolean)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      this.hCy.dy(bool);
      aBh();
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "disableTalkroom enable " + bool);
      return;
    }
  }

  public final void mM(int paramInt)
  {
    if (this.hCH != paramInt)
    {
      this.hCH = paramInt;
      this.hCG = true;
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "onConfigChanged:" + paramConfiguration.orientation);
      this.gfv = false;
      this.gfy.px(0);
      aBj();
      requestLayout();
    }
  }

  public final void refresh()
  {
    z.v("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "app panel refleshed");
    try
    {
      String str = com.tencent.mm.f.e.or().getValue("ShowAPPSuggestion");
      if ((ch.jb(str)) || (Integer.valueOf(str).intValue() != 1))
      {
        this.hCn = com.tencent.mm.pluginsdk.model.app.l.a(this.context, false, this.hCB);
        z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "jacks not show App Suggestion");
      }
      while (true)
      {
        aAY();
        if (this.hCy != null)
          this.hCy.dx(this.hCC);
        int i = this.gfy.aRG();
        aBk();
        this.gfy.px(i);
        this.gfz.pu(i);
        return;
        z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "jacks show App Suggestion");
        this.hCn = com.tencent.mm.pluginsdk.model.app.l.a(this.context, true, this.hCB);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "exception in appPanel init, %s", arrayOfObject);
        this.hCn = com.tencent.mm.pluginsdk.model.app.l.a(this.context, false, this.hCB);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppPanel
 * JD-Core Version:    0.6.2
 */