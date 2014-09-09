package com.tencent.mm.pluginsdk.ui.chat;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnDragListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.f;
import com.tencent.mm.g;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.bb;
import com.tencent.mm.pluginsdk.ui.simley.VPSmileyPanel;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.dz;
import com.tencent.mm.ui.widget.MMEditText;

public class ChatFooter extends LinearLayout
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private static int count = 0;
  private static final int[] enl = { 0, 15, 30, 45, 60, 75, 90, 100 };
  private static final int[] enm = arrayOfInt;
  private Activity cHB;
  private String cIA;
  private Context context;
  private String diG;
  private View eTY;
  private View eTZ;
  private View eUa;
  private View eUb;
  private boolean enB = false;
  private final cm enK = new z(this);
  private ImageView ent;
  private View erf = null;
  private MMEditText gGu = null;
  private Button gGv = null;
  private ChatFooterPanel gGx;
  private cn gQf;
  private TextView gQg;
  private ImageView gQh;
  private View gQi;
  private com.tencent.mm.pluginsdk.ui.h hDA = new w(this);
  private m hDB = new x(this);
  ap hDC;
  private int hDD = 0;
  private final int hDE = 0;
  private final int hDF = 1;
  private final int hDG = 2;
  private final int hDH = 20;
  private final int hDI = 21;
  private final int hDJ = 22;
  private int hDK = 0;
  private int hDL = 0;
  private int hDM = -1;
  private boolean hDN = false;
  private final int hDO = 4097;
  private final int hDP = 4098;
  private volatile boolean hDQ;
  private cm hDR = new ag(this);
  private int hDS = -1;
  private String hDa;
  private bm hDb;
  private AppPanel hDc;
  private TextView hDd = null;
  private Button hDe;
  private ImageButton hDf;
  private LinearLayout hDg;
  private ChatFooterBottom hDh;
  private ImageButton hDi;
  private ImageButton hDj;
  private com.tencent.mm.ui.base.aa hDk;
  private ax hDl;
  private bh hDm;
  private aq hDn;
  private ao hDo = null;
  private final an hDp = new an((byte)0);
  private boolean hDq = false;
  private TextView hDr;
  private InputMethodManager hDs;
  private int hDt;
  private boolean hDu = false;
  private boolean hDv = false;
  private bl hDw = new p(this);
  private boolean hDx = false;
  private dz hDy;
  private boolean hDz = false;
  private int hxA;
  au hxz;
  private final cm mHandler = new aa(this);
  private int py = -1;

  static
  {
    int[] arrayOfInt = new int[7];
    arrayOfInt[0] = com.tencent.mm.h.QZ;
    arrayOfInt[1] = com.tencent.mm.h.Ra;
    arrayOfInt[2] = com.tencent.mm.h.Rb;
    arrayOfInt[3] = com.tencent.mm.h.Rc;
    arrayOfInt[4] = com.tencent.mm.h.Rd;
    arrayOfInt[5] = com.tencent.mm.h.Re;
    arrayOfInt[6] = com.tencent.mm.h.Rf;
  }

  public ChatFooter(Context paramContext)
  {
    this(paramContext, null);
  }

  public ChatFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ChatFooter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    long l = System.currentTimeMillis();
    this.hDs = ((InputMethodManager)paramContext.getSystemService("input_method"));
    this.erf = inflate(paramContext, k.bch, this);
    this.gGu = ((MMEditText)this.erf.findViewById(i.alo));
    this.gGu.getInputExtras(true).putBoolean("IS_CHAT_EDITOR", true);
    this.hDg = ((LinearLayout)this.erf.findViewById(i.aSD));
    this.hDh = ((ChatFooterBottom)findViewById(i.alj));
    this.hDi = ((ImageButton)this.erf.findViewById(i.ald));
    this.gGv = ((Button)this.erf.findViewById(i.alZ));
    getViewTreeObserver().addOnGlobalLayoutListener(this);
    this.hDe = ((Button)this.erf.findViewById(i.aWa));
    this.hDf = ((ImageButton)findViewById(i.alR));
    cr(false);
    aCA();
    this.hDl = new ax(getContext(), getRootView(), this, new ai(this, paramContext));
    this.hDm = new bh(getContext(), getRootView(), this, this.gGu);
    this.hDm.a(this.hDw);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.gGu.getImeOptions());
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "send edittext ime option %s", arrayOfObject1);
    this.gGu.setOnEditorActionListener(new aj(this));
    this.gGu.setOnTouchListener(new ak(this));
    this.gGu.setOnLongClickListener(new al(this));
    this.gGv.setOnClickListener(new am(this));
    this.hDe.setOnTouchListener(new u(this));
    this.hDe.setOnKeyListener(new v(this));
    this.hDf.setOnClickListener(new t(this));
    aBN();
    this.hDi.setVisibility(0);
    this.hDi.setContentDescription(getContext().getString(com.tencent.mm.n.fgS));
    this.hDi.setOnClickListener(new r(this));
    mS(-1);
    findViewById(i.alw).setOnTouchListener(new q(this));
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - l);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "init time: %d", arrayOfObject2);
  }

  private void aBL()
  {
    if (as.aCF() == null)
      this.gGx = new ar(this.context);
    do
    {
      return;
      if (this.gGx != null)
        this.gGx.destroy();
      this.gGx = as.aCF().bg(this.context);
    }
    while (this.gGx == null);
    if (this.gGx != null)
      this.gGx.setVisibility(8);
    if (this.gGx != null)
      this.gGx.mq(this.hxA);
    if (this.hDh != null)
      this.hDh.addView(this.gGx, -1, -2);
    if (this.gGx != null)
      this.gGx.a(this.hDA);
    ChatFooterPanel localChatFooterPanel;
    if (this.gGx != null)
    {
      localChatFooterPanel = this.gGx;
      if (this.gGu.getText().length() <= 0)
        break label223;
    }
    label223: for (boolean bool = true; ; bool = false)
    {
      localChatFooterPanel.de(bool);
      if ((this.gGx != null) && ((this.gGx instanceof VPSmileyPanel)))
      {
        ((VPSmileyPanel)this.gGx).vW(this.hDa);
        ((VPSmileyPanel)this.gGx).nl(com.tencent.mm.compatible.g.n.R(getContext()));
      }
      b(this.hxz);
      return;
    }
  }

  private void aBN()
  {
    this.hDc = ((AppPanel)findViewById(i.akO));
    this.hDc.a(this.hDB);
    this.hDc.mM(com.tencent.mm.compatible.g.n.R(getContext()));
    if ((y.dP(this.hDa)) || (y.dK(this.hDa)))
    {
      this.hDc.aAW();
      return;
    }
    if (!y.dj(this.hDa))
      y.dc(this.hDa);
    this.hDc.aAW();
  }

  public static void aCn()
  {
  }

  private boolean aCs()
  {
    return (this.hDM > 0) && (this.hDM < this.py);
  }

  private void aCu()
  {
    this.hDh.setVisibility(8);
    this.hDc.setVisibility(8);
    if (this.gGx != null)
      this.gGx.setVisibility(8);
    dJ(false);
  }

  private void aCy()
  {
    this.enB = false;
    this.hDe.setBackgroundDrawable(com.tencent.mm.aq.a.n(getContext(), com.tencent.mm.h.ZE));
    this.hDe.setText(com.tencent.mm.n.byr);
    if (this.hDn != null)
    {
      if ((this.eUb != null) && (this.eUb.getVisibility() == 0))
        this.hDn.YS();
    }
    else
      return;
    this.hDn.YQ();
  }

  private void cr(boolean paramBoolean)
  {
    Animation localAnimation1 = AnimationUtils.loadAnimation(getContext(), com.tencent.mm.b.Mz);
    Animation localAnimation2 = AnimationUtils.loadAnimation(getContext(), com.tencent.mm.b.MA);
    localAnimation1.setDuration(150L);
    localAnimation2.setDuration(150L);
    if ((this.gGv == null) || (this.hDi == null));
    do
    {
      do
      {
        return;
        if (!this.hDx)
          break;
      }
      while (this.hDi.getVisibility() == 0);
      this.hDi.setVisibility(0);
      return;
    }
    while (((this.gGv.getVisibility() == 0) && (paramBoolean)) || ((this.hDi.getVisibility() == 0) && (!paramBoolean)));
    if (paramBoolean)
    {
      this.gGv.startAnimation(localAnimation1);
      this.gGv.setVisibility(0);
      this.hDi.startAnimation(localAnimation2);
      this.hDi.setVisibility(8);
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(paramBoolean);
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "jacks canSend:%B", arrayOfObject);
      this.gGv.getParent().requestLayout();
      return;
      this.hDi.startAnimation(localAnimation1);
      this.hDi.setVisibility(0);
      this.gGv.startAnimation(localAnimation2);
      this.gGv.setVisibility(8);
    }
  }

  private void dC(boolean paramBoolean)
  {
    dD(paramBoolean);
    dE(paramBoolean);
  }

  private void dD(boolean paramBoolean)
  {
    if (this.gGu == null)
      return;
    if (paramBoolean)
    {
      this.gGu.requestFocus();
      return;
    }
    this.gGu.clearFocus();
  }

  private void dE(boolean paramBoolean)
  {
    if (this.erf == null)
      return;
    if (paramBoolean)
    {
      this.erf.findViewById(i.aSD).setEnabled(true);
      return;
    }
    this.erf.findViewById(i.aSD).setEnabled(false);
  }

  private void dJ(boolean paramBoolean)
  {
    if (this.hDj == null);
    while (((this.hDN) && (paramBoolean)) || ((!this.hDN) && (!paramBoolean)))
      return;
    this.hDN = paramBoolean;
    if (paramBoolean)
    {
      this.hDj.setImageDrawable(getContext().getResources().getDrawable(com.tencent.mm.h.TR));
      return;
    }
    this.hDj.setImageDrawable(getContext().getResources().getDrawable(com.tencent.mm.h.TU));
  }

  private void f(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 1;
    if (paramBoolean)
    {
      this.hDi.setContentDescription(getContext().getString(com.tencent.mm.n.fgQ));
      switch (paramInt1)
      {
      default:
        paramBoolean = false;
        if (((paramBoolean) && (paramInt2 != 21) && (this.hDj != null)) || ((this.hDj != null) && (!paramBoolean) && ((paramInt2 == 21) || (paramInt2 == 20))))
          dJ(false);
        if ((paramInt1 == 0) && (!paramBoolean))
          dJ(false);
        break;
      case 1:
      case 2:
      }
    }
    while ((!paramBoolean) || (paramInt2 == 22))
    {
      return;
      this.hDh.aCD();
      dC(i);
      this.hDs.showSoftInput(this.gGu, 0);
      break;
      if (paramInt2 == 22)
      {
        if (this.hDc == null)
          aBN();
        this.hDc.aBl();
        if (this.gGx != null)
          this.gGx.setVisibility(8);
        this.hDc.setVisibility(0);
        this.hDl.aCH();
        dC(false);
        if (this.hDt == 2)
          mR(i);
      }
      while (true)
      {
        this.hDh.setVisibility(0);
        if ((!aCs()) || (!com.tencent.mm.compatible.g.n.W(getContext())))
        {
          ViewGroup.LayoutParams localLayoutParams = this.hDh.getLayoutParams();
          if ((localLayoutParams != null) && (localLayoutParams.height == 0))
          {
            localLayoutParams.height = com.tencent.mm.compatible.g.n.U(getContext());
            this.hDh.setLayoutParams(localLayoutParams);
          }
        }
        ch.ak(this);
        break;
        if (paramInt2 == 21)
        {
          if (this.hDc != null)
            this.hDc.setVisibility(8);
          if (this.gGx == null)
            aBL();
          this.gGx.onResume();
          if (this.gGx != null)
            this.gGx.setVisibility(0);
          dJ(i);
          dC(i);
        }
      }
      this.hDi.setContentDescription(getContext().getString(com.tencent.mm.n.fgS));
      switch (paramInt1)
      {
      default:
        break;
      case 0:
        ch.ak(this);
        aCu();
        break;
      case 1:
        ch.ak(this);
        break;
      case 2:
        if (paramInt2 == 20)
        {
          aCu();
          break;
        }
        if (paramInt2 == 22)
        {
          this.hDc.setVisibility(8);
          break;
        }
        if ((paramInt2 != 21) || (this.gGx == null))
          break;
        this.gGx.setVisibility(8);
        break;
      }
    }
    if (this.gGu.length() > 0);
    while (true)
    {
      cr(i);
      return;
      int j = 0;
    }
  }

  private void mN(int paramInt)
  {
    if (this.hDf == null)
      return;
    if (paramInt == com.tencent.mm.h.TY);
    for (int i = 1; ; i = 0)
    {
      if (this.hDf != null)
      {
        if (i == 0)
          break label83;
        this.hDf.setContentDescription(getContext().getString(com.tencent.mm.n.byl));
      }
      while (true)
      {
        this.hDf.setImageResource(paramInt);
        this.hDf.setPadding(0, getResources().getDimensionPixelSize(g.csV), 0, getResources().getDimensionPixelSize(g.PO));
        return;
        label83: this.hDf.setContentDescription(getContext().getString(com.tencent.mm.n.byk));
      }
    }
  }

  private void mR(int paramInt)
  {
    this.hDt = paramInt;
    switch (paramInt)
    {
    default:
      return;
    case 1:
      this.hDg.setVisibility(0);
      this.hDe.setVisibility(8);
      mN(com.tencent.mm.h.TY);
      return;
    case 2:
    }
    this.hDg.setVisibility(8);
    this.hDe.setVisibility(0);
    mN(com.tencent.mm.h.TX);
  }

  private void mS(int paramInt)
  {
    if (paramInt <= 0);
    for (int i = 1; ; i = 0)
    {
      int j = com.tencent.mm.compatible.g.n.c(this.context, paramInt);
      if ((i != 0) && (j > 0) && (this.hDh != null))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(j);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "set bottom panel height: %d", arrayOfObject);
        Object localObject = new LinearLayout.LayoutParams(-1, j);
        if (this.hDh.getLayoutParams() != null)
          localObject = this.hDh.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = j;
        this.hDh.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (this.hDc != null)
        this.hDc.mM(j);
      if (this.hDb != null)
        this.hDb.mU(j);
      if (this.gGx != null)
      {
        ((VPSmileyPanel)this.gGx).nl(j);
        aCg();
        if ((this.gGx instanceof VPSmileyPanel))
          ((VPSmileyPanel)this.gGx).aEP();
      }
      return;
    }
  }

  public final void G(String paramString, boolean paramBoolean)
  {
    d(paramString, -1, paramBoolean);
  }

  public final void St()
  {
    post(new ab(this));
  }

  public final void a(Context paramContext, Activity paramActivity)
  {
    this.cHB = paramActivity;
    if (this.gGx != null)
      this.gGx.onResume();
    if ((!this.hDx) && (this.hDv))
    {
      this.hDv = false;
      this.gGu.setImeOptions(0);
      this.gGu.setInputType(0x40 | this.gGu.getInputType());
    }
    while (true)
    {
      if (this.hDc != null)
        this.hDc.bm(paramContext);
      this.context = paramContext;
      this.hDl.aCI();
      this.erf.findViewById(i.ama).setVisibility(0);
      aCd();
      post(new ah(this));
      return;
      if ((this.hDx) && (!this.hDv))
        aCf();
    }
  }

  @TargetApi(11)
  public final void a(View.OnDragListener paramOnDragListener)
  {
    this.gGu.setOnDragListener(paramOnDragListener);
  }

  public final void a(ao paramao)
  {
    this.hDo = paramao;
    if (paramao == null)
      return;
    View localView = findViewById(i.alS);
    localView.setVisibility(0);
    localView.setOnClickListener(new ac(this));
  }

  public final void a(aq paramaq)
  {
    this.hDn = paramaq;
  }

  public final void a(l paraml)
  {
    this.hDc.a(paraml);
  }

  public final void a(dz paramdz)
  {
    this.hDy = paramdz;
    a(paramdz.agh(), paramdz.h());
  }

  public final void aBI()
  {
    this.gGu.setText("");
    dD(false);
  }

  public final void aBJ()
  {
    View localView = findViewById(i.alS);
    if (localView != null)
      localView.setVisibility(8);
    this.mHandler.removeMessages(1002);
    if (this.hDi != null)
      this.hDi.setVisibility(8);
    if (this.hDj != null)
      this.hDj.setVisibility(8);
    if (this.hDg != null)
      this.hDg.setVisibility(8);
    if (this.eTY != null)
      this.eTY.setVisibility(8);
    this.gGv.setVisibility(8);
    if (this.eUa != null)
      this.eUa.setVisibility(8);
    if (this.eUb != null)
      this.eUb.setVisibility(8);
    if (this.eTZ != null)
      this.eTZ.setVisibility(8);
    if (this.hDb != null)
      this.hDb.setVisibility(8);
    if (this.eTY != null)
      this.eTY.setVisibility(8);
    if (this.gQi != null)
      this.gQi.setVisibility(8);
    if (this.gQf != null)
      this.gQf.update();
    if (this.hDd != null)
      this.hDd.setVisibility(8);
    if (this.hDh != null)
      this.hDh.setVisibility(8);
    this.hDc = ((AppPanel)findViewById(i.akO));
    if (this.hDc != null)
    {
      this.hDc.setVisibility(8);
      this.hDc.aqb();
    }
    if (this.gGx != null)
    {
      this.gGx.destroy();
      this.hDh.removeView(this.gGx);
      this.gGx = null;
    }
    aCy();
  }

  public final void aBK()
  {
    if (this.hDc == null)
      return;
    this.hDc.aAZ();
  }

  public final au aBM()
  {
    return this.hxz;
  }

  public final void aBO()
  {
    this.hDt = 1;
    this.hDg.setVisibility(0);
    this.hDe.setVisibility(8);
    if (this.hDb != null)
      this.hDb.setVisibility(8);
    if (this.gGx != null)
      this.gGx.reset();
    f(2, 21, true);
  }

  public final boolean aBP()
  {
    return this.hDq;
  }

  public final String aBQ()
  {
    return this.hDp.hDX;
  }

  public final String aBR()
  {
    return this.hDp.hDW;
  }

  public final int aBS()
  {
    return this.hDp.hDY;
  }

  public final void aBT()
  {
    this.hDe.setEnabled(false);
    this.hDe.setBackgroundDrawable(com.tencent.mm.aq.a.n(getContext(), com.tencent.mm.h.ZD));
    if (this.gQf != null)
    {
      this.eTZ.setVisibility(0);
      this.eTY.setVisibility(8);
      this.gQi.setVisibility(8);
      this.gQf.update();
    }
    this.enK.sendEmptyMessageDelayed(0, 500L);
  }

  public final String aBU()
  {
    if (this.gGu == null)
      return "";
    return this.gGu.getText().toString();
  }

  public final void aBV()
  {
    if (this.hDC != null)
    {
      this.gGu.removeTextChangedListener(this.hDC);
      this.hDC = null;
    }
  }

  public final void aBW()
  {
    this.gQi.setVisibility(8);
    this.eTY.setVisibility(0);
  }

  public final void aBX()
  {
    this.hDg.setVisibility(0);
    this.hDf.setVisibility(8);
    this.hDe.setVisibility(8);
  }

  public final void aBY()
  {
    if (this.hDf != null)
      this.hDf.setVisibility(0);
  }

  public final void aBZ()
  {
    this.hDc.aBd();
  }

  public final void aBa()
  {
    this.hDc.aBa();
  }

  public final void aBb()
  {
    this.hDc.aBb();
  }

  public final void aBe()
  {
    this.hDc.aBe();
  }

  public final void aCA()
  {
    this.hDx = ((Boolean)bg.qW().oQ().get(66832, Boolean.valueOf(false))).booleanValue();
  }

  public final void aCa()
  {
    this.hDc.aBf();
  }

  public final void aCb()
  {
    this.hDc.aBc();
  }

  public final void aCc()
  {
    this.hDc.aBg();
  }

  public final void aCd()
  {
    this.hDj = ((ImageButton)this.erf.findViewById(i.amd));
    this.hDj.setVisibility(0);
    this.hDj.setOnClickListener(new s(this));
    if (this.hDm != null)
      this.hDm.ah(this.hDj);
  }

  public final void aCe()
  {
    this.hDi.setVisibility(8);
  }

  public final void aCf()
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "chatting footer enable ener button send");
    this.hDv = true;
    this.gGu.setImeOptions(4);
    this.gGu.setInputType(0xFFFFFFBF & this.gGu.getInputType());
  }

  public final void aCg()
  {
    if (this.gGx != null)
      this.gGx.azM();
  }

  public final void aCh()
  {
    this.hDc.refresh();
  }

  public final void aCi()
  {
    aCu();
    mS(-1);
  }

  public final void aCj()
  {
    aCq();
  }

  public final boolean aCk()
  {
    return this.hDh.getVisibility() == 0;
  }

  public final void aCm()
  {
    this.hDd = ((TextView)this.erf.findViewById(i.amD));
    MMEditText localMMEditText = this.gGu;
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(140);
    localMMEditText.setFilters(arrayOfInputFilter);
  }

  public final void aCo()
  {
    f(1, -1, true);
    dC(true);
  }

  public final void aCp()
  {
    f(0, -1, false);
  }

  public final void aCq()
  {
    f(2, 20, false);
  }

  public final void aCr()
  {
    f(2, 22, true);
  }

  public final void aCt()
  {
    if (this.gGu != null)
      this.gGu.setText("");
  }

  public final boolean aCz()
  {
    return this.hDL - getTop() > 50;
  }

  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    this.hDC = new ap(this, paramTextWatcher);
    this.gGu.addTextChangedListener(this.hDC);
  }

  public final void aep()
  {
    f(1, -1, true);
  }

  public final void b(bb parambb)
  {
    this.hDm.c(parambb);
  }

  public final void b(au paramau)
  {
    if (this.gGx != null)
    {
      this.gGx.a(paramau);
      return;
    }
    this.hxz = paramau;
  }

  public final void bg(String paramString1, String paramString2)
  {
    this.diG = paramString1;
    this.cIA = paramString2;
  }

  public final void d(String paramString, int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && ((paramString == null) || (paramString.length() == 0) || (this.gGu == null)))
    {
      this.gGu.setText("");
      return;
    }
    this.hDq = true;
    MMEditText localMMEditText = this.gGu;
    localMMEditText.setText(com.tencent.mm.ar.b.b(getContext(), paramString, (int)this.gGu.getTextSize(), false));
    this.hDq = false;
    if ((paramInt < 0) || (paramInt > this.gGu.getText().length()))
    {
      this.gGu.setSelection(this.gGu.getText().length());
      return;
    }
    this.gGu.setSelection(paramInt);
  }

  public final void dF(boolean paramBoolean)
  {
    if (this.gGx != null)
      this.gGx.s(paramBoolean, false);
  }

  public final void dG(boolean paramBoolean)
  {
    this.hDc.du(paramBoolean);
  }

  @TargetApi(11)
  public final void dH(boolean paramBoolean)
  {
    if (j.cp(11))
    {
      com.tencent.mm.compatible.a.a.a(11, new ad(this, paramBoolean));
      return;
    }
    if (paramBoolean)
    {
      this.gGu.setTextColor(getResources().getColor(f.Ot));
      return;
    }
    this.gGu.setTextColor(getResources().getColor(f.Og));
    dC(false);
  }

  public final void dI(boolean paramBoolean)
  {
    ch.ak(this);
    dE(false);
    dD(paramBoolean);
  }

  public final void destroy()
  {
    if (this.gGx != null)
    {
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "jacks chat footer desctory smiley panel");
      this.gGx.destroy();
    }
    if (this.hDn != null)
      this.hDn.release();
    if (this.hDm != null)
    {
      this.hDm.a(null);
      this.hDm.c(null);
    }
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "jacks destory");
  }

  public final void dt(boolean paramBoolean)
  {
    this.hDc.dt(paramBoolean);
  }

  public final int getMode()
  {
    return this.hDt;
  }

  public final void le(String paramString)
  {
    this.hDa = paramString;
    if (this.gGx != null)
      ((VPSmileyPanel)this.gGx).vW(this.hDa);
    if (this.hDc != null)
    {
      if ((y.dP(this.hDa)) || (y.dK(this.hDa)))
        this.hDc.aAX();
    }
    else
      return;
    if (!y.dj(this.hDa))
      y.dc(this.hDa);
    this.hDc.aAX();
  }

  public final void mO(int paramInt)
  {
    this.hDp.hDY = paramInt;
  }

  public final void mP(int paramInt)
  {
    this.hDD = 0;
    int i = com.tencent.mm.aq.a.fromDPToPix(getContext(), 180);
    int j = com.tencent.mm.sdk.platformtools.e.a(getContext(), 50.0F);
    if (paramInt + j < i);
    for (this.hDD = -1; ; this.hDD = (j + (paramInt - i) / 2))
    {
      if (this.gQf == null)
      {
        this.gQf = new cn(View.inflate(getContext(), k.bpd, null), -1, -2);
        this.ent = ((ImageView)this.gQf.getContentView().findViewById(i.aVP));
        this.eUa = this.gQf.getContentView().findViewById(i.aVQ);
        this.eUb = this.gQf.getContentView().findViewById(i.aVS);
        this.gQg = ((TextView)this.gQf.getContentView().findViewById(i.aVU));
        this.gQh = ((ImageView)this.gQf.getContentView().findViewById(i.aVT));
        this.gQi = this.gQf.getContentView().findViewById(i.aVV);
        this.eTY = this.gQf.getContentView().findViewById(i.aVW);
        this.eTZ = this.gQf.getContentView().findViewById(i.aVX);
        this.hDr = ((TextView)this.gQf.getContentView().findViewById(i.aVZ));
      }
      if (this.hDD != -1)
      {
        this.eTZ.setVisibility(8);
        this.eTY.setVisibility(8);
        this.gQi.setVisibility(0);
        this.gQf.showAtLocation(this, 49, 0, this.hDD);
      }
      return;
    }
  }

  public final void mQ(int paramInt)
  {
    for (int i = 0; ; i++)
      if (i < enm.length)
      {
        if ((paramInt >= enl[i]) && (paramInt < enl[(i + 1)]))
          this.ent.setBackgroundDrawable(com.tencent.mm.aq.a.n(getContext(), enm[i]));
      }
      else
      {
        if ((paramInt == -1) && (this.gQf != null))
        {
          this.gQf.dismiss();
          this.gQi.setVisibility(0);
          this.eTY.setVisibility(8);
          this.eTZ.setVisibility(8);
        }
        return;
      }
  }

  public void onGlobalLayout()
  {
    if ((this.cHB == null) || (this.cHB.getWindow() == null) || (this.cHB.getWindow().getDecorView() == null));
    int i;
    do
    {
      return;
      i = this.cHB.getWindow().getDecorView().findViewById(i.aEn).getHeight();
      if (this.py < i)
        this.py = i;
      this.hDM = i;
      if (this.hDS < 0)
      {
        this.hDS = i;
        return;
      }
    }
    while (this.hDS == i);
    if ((aCs()) && (this.hDz))
    {
      this.hDz = false;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "jacks Show keybord & hide diy panel by onGlobalLayout");
      postDelayed(new ae(this), 10L);
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.hDS);
    arrayOfObject1[1] = Integer.valueOf(i);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "keybord old: %d, new: %d", arrayOfObject1);
    int j = Math.abs(this.hDS - i);
    this.hDS = i;
    if (this.hDK != j)
    {
      this.hDK = j;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(this.hDK);
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "jacks calc keyBord dialog height:%d", arrayOfObject2);
      com.tencent.mm.compatible.g.n.b(getContext(), j);
      mS(j);
    }
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "Jacks Keyboard Size: " + j);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = Integer.valueOf(paramInt3);
    arrayOfObject[4] = Integer.valueOf(paramInt4);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", arrayOfObject);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (getTop() != 0)
    {
      if (getTop() > this.hDL)
        this.hDL = getTop();
      if (this.hDL - getTop() <= 50)
        break label132;
      if (this.hDn != null)
        this.hDn.by(true);
    }
    label132: 
    do
      while (!paramBoolean)
      {
        return;
        if (this.hDn != null)
          this.hDn.by(false);
      }
    while (this.hDm == null);
    this.hDm.update();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(View.MeasureSpec.getSize(paramInt1));
    arrayOfObject[1] = Integer.valueOf(View.MeasureSpec.getSize(paramInt2));
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "jacks onMeasure  width:%d, height:%d", arrayOfObject);
  }

  public final void onPause()
  {
    this.hDz = true;
    if (this.gGx != null)
      this.gGx.onPause();
    if (this.hDb != null)
      this.hDb.reset();
    this.hDn.onPause();
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    arrayOfObject[3] = Integer.valueOf(paramInt4);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "jacks onSizeChanged  w:%d, h:%d, oldw:%d, oldh:%d", arrayOfObject);
  }

  public final void q(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    mR(paramInt);
    switch (paramInt)
    {
    default:
      setVisibility(0);
      return;
    case 1:
      dC(i);
      aCu();
      if (paramBoolean)
      {
        f(i, -1, i);
        if (this.gGu.length() > 0);
        while (true)
        {
          cr(i);
          return;
          int j = 0;
        }
      }
      cr(false);
      return;
    case 2:
    }
    f(0, -1, false);
    cr(false);
  }

  public final void setMode(int paramInt)
  {
    q(paramInt, true);
  }

  public final void t(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.hDc.dr(paramBoolean1);
    this.hDc.ds(paramBoolean2);
  }

  public final void vA(String paramString)
  {
    if (!ch.jb(paramString))
    {
      if (this.gGx == null)
        aBL();
      if ((this.gGx instanceof VPSmileyPanel))
        ((VPSmileyPanel)this.gGx).vZ(paramString);
    }
  }

  public final void vB(String paramString)
  {
    this.hDp.hDX = paramString;
  }

  public final void vC(String paramString)
  {
    this.hDp.hDW = paramString;
  }

  public final void vD(String paramString)
  {
    d(paramString, -1, true);
  }

  public final void vE(String paramString)
  {
    if ((paramString == null) || (this.hDr == null))
      return;
    this.hDr.setText(paramString);
  }

  public final void vF(String paramString)
  {
    if ((this.hDm != null) && (this.gGv != null) && (aCs()))
      this.hDm.vJ(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter
 * JD-Core Version:    0.6.2
 */