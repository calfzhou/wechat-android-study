package com.tencent.mm.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ar.b;
import com.tencent.mm.c.a.mf;
import com.tencent.mm.c.a.t;
import com.tencent.mm.c.a.v;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.ui.base.fk;
import com.tencent.mm.ui.tools.fj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public abstract class cg
{
  private static boolean iLX = false;
  private static final int iMi = k.cAO;
  String className;
  private AudioManager dHi;
  protected com.tencent.mm.sdk.platformtools.cm eRb = new com.tencent.mm.sdk.platformtools.cm(Looper.getMainLooper());
  private int eWW = 0;
  private View epk;
  private LayoutInflater fpT;
  private fj fqB;
  private final long gLm = 300L;
  private long gLn = SystemClock.elapsedRealtime();
  private int gQF;
  private ActionBarActivity hE;
  private ActionBar hF;
  private View iLF;
  private View iLG;
  private View iLH;
  private TextView iLI;
  private FrameLayout iLJ;
  private boolean iLK = true;
  private String iLL = " ";
  private int iLM = 0;
  private int iLN = 0;
  private com.tencent.mm.ui.widget.a iLO = null;
  private com.tencent.mm.ui.widget.a iLP = null;
  private com.tencent.mm.ui.widget.a iLQ = null;
  private com.tencent.mm.ui.widget.a iLR = null;
  private boolean iLS = false;
  private boolean iLT = false;
  private boolean iLU;
  private ct iLV = new ct();
  private LinkedList iLW = new LinkedList();
  private ArrayList iLY;
  private View iLZ;
  protected boolean iLq = false;
  private TextView iMa;
  private View iMb;
  private ImageView iMc;
  private View iMd;
  private TextView iMe;
  private mf iMf = null;
  private com.tencent.mm.sdk.c.g iMg = new ch(this);
  private int iMh = k.cAN;
  private int iMj = 0;
  private ct iMk;
  private MenuItem iMl;
  private Runnable iMm = new cr(this);
  private Runnable iMn = new cs(this);

  private void a(int paramInt1, int paramInt2, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, int paramInt3)
  {
    ct localct = new ct();
    localct.iMu = paramInt1;
    localct.iMv = paramInt2;
    localct.text = paramString;
    localct.fUd = paramOnMenuItemClickListener;
    localct.eRi = paramOnLongClickListener;
    localct.iMy = paramInt3;
    if ((localct.iMv == h.WS) && (com.tencent.mm.sdk.platformtools.ch.jb(paramString)))
      localct.text = this.hE.getString(n.bQv);
    int i = localct.iMu;
    for (int j = 0; ; j++)
      if (j < this.iLW.size())
      {
        if (((ct)this.iLW.get(j)).iMu == i)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(i);
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "match menu, id %d, remove it", arrayOfObject);
          this.iLW.remove(j);
        }
      }
      else
      {
        this.iLW.add(localct);
        new com.tencent.mm.sdk.platformtools.cm().postDelayed(new ck(this), 200L);
        return;
      }
  }

  private void a(int paramInt, boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "initNotifyView viewid %d", arrayOfObject);
    if ((!paramBoolean1) && (this.iLH == null))
      break label35;
    label35: 
    while ((this.hF != null) && (!this.hF.isShowing()))
      return;
    if (this.iLJ == null)
      this.iLJ = ((FrameLayout)this.epk.findViewById(i.aEn));
    if (this.iLH != null)
      this.iLJ.removeView(this.iLH);
    int i = k.bjL;
    if (paramInt > 0);
    while (true)
    {
      this.iLH = this.fpT.inflate(paramInt, null);
      this.iLI = ((TextView)this.iLH.findViewById(i.aGA));
      this.iLH.findViewById(i.aGw).setOnClickListener(new cl(this));
      this.iLH.setVisibility(8);
      this.iLH.setOnClickListener(new cm(this, paramString1));
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, e.a(this.hE, 47.0F));
      this.iLJ.addView(this.iLH, this.iLJ.getChildCount(), localLayoutParams);
      if (this.iLH == null)
        break;
      if (paramBoolean2)
      {
        View localView = this.iLH;
        int j;
        if (paramBoolean1)
        {
          j = 0;
          localView.setVisibility(j);
          String str = this.hE.getString(n.bOR);
          if (com.tencent.mm.sdk.platformtools.ch.jb(paramString2))
            paramString2 = this.hE.getString(n.bOQ);
          if (paramString1 == null)
            break label381;
          SpannableString localSpannableString = new SpannableString(paramString2 + str);
          localSpannableString.setSpan(new ForegroundColorSpan(-10119449), paramString2.length(), paramString2.length() + str.length(), 33);
          this.iLI.setText(localSpannableString);
        }
        while (true)
        {
          this.iLH.invalidate();
          this.iLJ.invalidate();
          return;
          j = 8;
          break;
          label381: this.iLI.setText(paramString2);
        }
      }
      this.iLH.post(new cn(this, paramBoolean1, paramString2, paramString1));
      return;
      paramInt = i;
    }
  }

  private void a(ActionBarActivity paramActionBarActivity)
  {
    if ((this.hF != null) && (!aPE()))
    {
      if (Build.VERSION.SDK_INT < 11)
        this.hF.setBackgroundDrawable(new ColorDrawable(this.hE.getResources().getColor(com.tencent.mm.f.NQ)));
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "onCreate, after");
      this.hF.setLogo(new ColorDrawable(this.hE.getResources().getColor(17170445)));
      this.hF.aJ();
      this.hF.setDisplayHomeAsUpEnabled(false);
      this.hF.aI();
      this.hF.aK();
      this.hF.setIcon(h.acr);
      this.hF.setCustomView(this.iMh);
      this.iMa = ((TextView)findViewById(16908308));
      this.iMe = ((TextView)findViewById(16908309));
      this.iLZ = findViewById(i.divider);
      this.iMb = findViewById(i.aXb);
      this.iMc = ((ImageView)findViewById(i.aXC));
      this.iMd = findViewById(i.aUu);
      this.iMa.setText(n.age);
      if (paramActionBarActivity.getClass().getName() == "WebViewUI")
      {
        this.iMd.setVisibility(8);
        this.iMc.setVisibility(0);
        this.iMb.setVisibility(0);
      }
    }
    else
    {
      return;
    }
    if ((paramActionBarActivity instanceof MMActivity))
    {
      this.iMd.setVisibility(8);
      this.iMc.setVisibility(0);
      this.iMb.setVisibility(0);
      this.iMa.setVisibility(0);
      return;
    }
    this.iMd.setVisibility(0);
    this.iMc.setVisibility(8);
    this.iMb.setVisibility(8);
  }

  private void a(MenuItem paramMenuItem, ct paramct)
  {
    if (!this.iLK)
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "callMenuCallback screen not enable.");
    while (paramct.fUd == null)
      return;
    paramct.fUd.onMenuItemClick(paramMenuItem);
  }

  private void a(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    boolean bool1;
    if (paramBoolean1)
    {
      Iterator localIterator2 = this.iLW.iterator();
      bool1 = false;
      if (!localIterator2.hasNext())
        break label131;
      ct localct2 = (ct)localIterator2.next();
      if (localct2.ebT == paramBoolean2)
        break label215;
      localct2.ebT = paramBoolean2;
    }
    label131: label208: label215: for (boolean bool4 = true; ; bool4 = bool1)
    {
      bool1 = bool4;
      break;
      Iterator localIterator1 = this.iLW.iterator();
      bool1 = false;
      if (localIterator1.hasNext())
      {
        ct localct1 = (ct)localIterator1.next();
        if ((localct1.iMu != paramInt) || (localct1.ebT == paramBoolean2))
          break label208;
        localct1.ebT = paramBoolean2;
      }
      for (boolean bool3 = true; ; bool3 = bool1)
      {
        bool1 = bool3;
        break;
        if (this.fqB == null);
        for (boolean bool2 = false; ; bool2 = this.fqB.aXw())
        {
          if (!bool2)
            this.hE.n();
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(paramInt);
          arrayOfObject[1] = Boolean.valueOf(bool1);
          arrayOfObject[2] = Boolean.valueOf(bool2);
          com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "enable option menu, target id %d, changed %B, searching %B", arrayOfObject);
          return;
        }
      }
    }
  }

  public static void aPJ()
  {
    iLX = true;
  }

  private void aQa()
  {
    String str1 = "%s";
    int i = this.hE.getResources().getDimensionPixelSize(com.tencent.mm.g.Pl);
    if (this.iLM != 0)
      str1 = "# " + str1;
    String str2;
    if (this.iLN != 0)
      str2 = str1 + " #";
    for (int j = 1; ; j = 0)
    {
      String str3;
      int k;
      if (this.iLS)
      {
        String str6 = str2 + " #";
        int i8 = j + 2;
        str3 = str6;
        k = i8;
      }
      for (int m = 1; ; m = 0)
      {
        String str4;
        int n;
        int i1;
        if (this.iLT)
        {
          String str5 = str3 + " #";
          int i6 = m + 2;
          int i7 = k + 2;
          str4 = str5;
          n = i7;
          i1 = i6;
        }
        for (int i2 = 1; ; i2 = 0)
        {
          com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "span title format %s", new Object[] { str4 });
          ActionBarActivity localActionBarActivity = this.hE;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.iLL;
          SpannableString localSpannableString = b.e(localActionBarActivity, String.format(str4, arrayOfObject), i);
          if (this.iLM != 0)
            localSpannableString.setSpan(this.iLO, 0, 1, 33);
          if (this.iLN != 0)
          {
            int i5 = localSpannableString.length() - n;
            localSpannableString.setSpan(this.iLP, i5, i5 + 1, 33);
          }
          if (this.iLS)
          {
            if (this.iLQ == null)
              this.iLQ = aY(i, h.Tq);
            int i4 = localSpannableString.length() - i1;
            localSpannableString.setSpan(this.iLQ, i4, i4 + 1, 33);
          }
          if (this.iLT)
          {
            if (this.iLR == null)
              this.iLR = aY(i, h.Tr);
            int i3 = localSpannableString.length() - i2;
            localSpannableString.setSpan(this.iLR, i3, i3 + 1, 33);
          }
          this.iMa.setText(localSpannableString);
          return;
          str4 = str3;
          n = k;
          i1 = m;
        }
        str3 = str2;
        k = j;
      }
      str2 = str1;
    }
  }

  private com.tencent.mm.ui.widget.a aY(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = this.hE.getResources().getDrawable(paramInt2);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    com.tencent.mm.ui.widget.a locala = new com.tencent.mm.ui.widget.a(localDrawable, 1);
    locala.rB((localDrawable.getIntrinsicHeight() - paramInt1) / 2);
    return locala;
  }

  private void b(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    boolean bool1;
    if (paramBoolean1)
    {
      Iterator localIterator2 = this.iLW.iterator();
      bool1 = false;
      if (!localIterator2.hasNext())
        break label131;
      ct localct2 = (ct)localIterator2.next();
      if (localct2.visible == paramBoolean2)
        break label215;
      localct2.visible = paramBoolean2;
    }
    label131: label208: label215: for (boolean bool4 = true; ; bool4 = bool1)
    {
      bool1 = bool4;
      break;
      Iterator localIterator1 = this.iLW.iterator();
      bool1 = false;
      if (localIterator1.hasNext())
      {
        ct localct1 = (ct)localIterator1.next();
        if ((localct1.iMu != paramInt) || (localct1.visible == paramBoolean2))
          break label208;
        localct1.visible = paramBoolean2;
      }
      for (boolean bool3 = true; ; bool3 = bool1)
      {
        bool1 = bool3;
        break;
        if (this.fqB == null);
        for (boolean bool2 = false; ; bool2 = this.fqB.aXw())
        {
          if (!bool2)
            this.hE.n();
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(paramInt);
          arrayOfObject[1] = Boolean.valueOf(bool1);
          arrayOfObject[2] = Boolean.valueOf(bool2);
          com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "show option menu, target id %d, changed %B, searching %B", arrayOfObject);
          return;
        }
      }
    }
  }

  public static Locale cg(Context paramContext)
  {
    String str = y.d(paramContext.getSharedPreferences(ak.aHi(), 0));
    if (str.equals("language_default"))
    {
      y.a(paramContext, Locale.ENGLISH);
      return Locale.getDefault();
    }
    Locale localLocale = y.xa(str);
    y.a(paramContext, localLocale);
    return localLocale;
  }

  private void eD(boolean paramBoolean)
  {
    if ((!iLX) && (paramBoolean))
    {
      fk.a(paramBoolean, new Intent().putExtra("classname", getClassName()).putExtra("main_process", false));
      return;
    }
    fk.a(paramBoolean, new Intent().putExtra("classname", getClassName() + aPL()));
  }

  private View findViewById(int paramInt)
  {
    View localView = this.epk.findViewById(paramInt);
    if (localView != null)
      return localView;
    return this.hE.findViewById(paramInt);
  }

  private ct oW(int paramInt)
  {
    Iterator localIterator = this.iLW.iterator();
    while (localIterator.hasNext())
    {
      ct localct = (ct)localIterator.next();
      if (localct.iMu == paramInt)
        return localct;
    }
    return null;
  }

  public final void Bt(String paramString)
  {
    if (this.hF == null)
      return;
    this.iLL = paramString;
    aQa();
    Bv(paramString);
  }

  public final void Bu(String paramString)
  {
    if (this.hF == null)
      return;
    if (paramString == null)
    {
      this.iMe.setVisibility(8);
      return;
    }
    this.iMe.setText(paramString);
    this.iMe.setVisibility(0);
    Bv(paramString);
  }

  protected final void Bv(String paramString)
  {
    com.tencent.mm.ui.a.a locala = com.tencent.mm.ui.a.a.aQs();
    ActionBarActivity localActionBarActivity = this.hE;
    if ((locala.aQt()) || (com.tencent.mm.sdk.platformtools.ch.jb(paramString)) || (localActionBarActivity == null))
      return;
    String str = localActionBarActivity.getString(n.bAJ) + paramString;
    localActionBarActivity.getWindow().getDecorView().setContentDescription(str);
  }

  public final void C(int paramInt, String paramString)
  {
    ct localct = oW(paramInt);
    if ((localct != null) && (!com.tencent.mm.sdk.platformtools.ch.Y(paramString, "").equals(localct.text)))
    {
      localct.text = paramString;
      this.hE.n();
    }
  }

  protected abstract void P(View paramView);

  public final void XF()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.hE.getSystemService("input_method");
    if (localInputMethodManager == null);
    IBinder localIBinder;
    do
    {
      View localView;
      do
      {
        return;
        localView = this.hE.getCurrentFocus();
      }
      while (localView == null);
      localIBinder = localView.getWindowToken();
    }
    while (localIBinder == null);
    localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt3, this.hE.getString(paramInt2), paramOnMenuItemClickListener, null, cu.iMz);
  }

  public final void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt2, "", paramOnMenuItemClickListener, null, cu.iMz);
  }

  public final void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    a(0, paramInt2, "", paramOnMenuItemClickListener, paramOnLongClickListener, cu.iMz);
  }

  public final void a(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt, 0, paramString, paramOnMenuItemClickListener, null, cu.iMz);
  }

  public final void a(int paramInt1, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, int paramInt2)
  {
    a(paramInt1, 0, paramString, paramOnMenuItemClickListener, null, paramInt2);
  }

  public final void a(Dialog paramDialog)
  {
    if (paramDialog == null)
      return;
    if (this.iLY == null)
      this.iLY = new ArrayList();
    this.iLY.add(paramDialog);
  }

  public final void a(Context paramContext, ActionBarActivity paramActionBarActivity)
  {
    this.hE = paramActionBarActivity;
    axa();
    this.className = getClass().getName();
    eu.D(3, this.className);
    cg(paramContext);
    this.dHi = ((AudioManager)this.hE.getSystemService("audio"));
    this.gQF = this.dHi.getStreamMaxVolume(3);
    int i = getLayoutId();
    this.fpT = LayoutInflater.from(this.hE);
    this.epk = this.fpT.inflate(k.bii, null);
    this.iLF = this.epk.findViewById(i.aEw);
    this.iLJ = ((FrameLayout)this.epk.findViewById(i.aEn));
    this.eWW = this.hE.getResources().getDimensionPixelSize(com.tencent.mm.g.PO);
    if (i != -1)
    {
      this.iLG = aPX();
      if (this.iLG == null)
        this.iLG = this.fpT.inflate(getLayoutId(), null);
      this.iLJ.addView(this.iLG, 0);
    }
    P(this.epk);
    int k;
    if (aPD())
    {
      ((ViewGroup)this.iLG.getParent()).removeView(this.iLG);
      ((ViewGroup)this.hE.getWindow().getDecorView()).addView(this.iLG, 0);
      int j = com.tencent.mm.aq.a.fromDPToPix(this.hE, 25);
      DisplayMetrics localDisplayMetrics = this.hE.getResources().getDisplayMetrics();
      if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
      {
        k = this.hE.getResources().getDimensionPixelSize(com.tencent.mm.g.Pr);
        this.iLG.setPadding(this.iLG.getPaddingLeft(), k + (j + this.iLG.getPaddingTop()), this.iLG.getPaddingRight(), this.iLG.getPaddingBottom());
      }
    }
    else
    {
      this.hF = this.hE.aM();
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "onCreate, before");
      a(paramActionBarActivity);
      if ((this.iLJ == null) || (!(this.iLJ instanceof LayoutListenerView)))
        break label492;
      ((LayoutListenerView)this.iLJ).a(new co(this));
    }
    while (true)
    {
      t localt = new t();
      localt.cHt.type = 2;
      com.tencent.mm.sdk.c.a.aGB().g(localt);
      if (localt.cHu.cHx == 2)
        a(localt.cHu.cHy, localt.cHu.visible, localt.cHu.url, localt.cHu.desc, true);
      return;
      k = this.hE.getResources().getDimensionPixelSize(com.tencent.mm.g.Ps);
      break;
      label492: com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "layoutListenerView is not right");
    }
  }

  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    if (this.hF == null)
      return;
    if (paramOnMenuItemClickListener == null)
      this.hF.setDisplayHomeAsUpEnabled(false);
    while (true)
    {
      if ((paramInt != 0) && (this.iMc != null))
        this.iMc.setImageResource(paramInt);
      this.iLV.iMu = 16908332;
      this.iLV.fUd = paramOnMenuItemClickListener;
      return;
      this.hF.setDisplayHomeAsUpEnabled(false);
      if (this.iMb != null)
        this.iMb.setOnClickListener(new cj(this, paramOnMenuItemClickListener));
    }
  }

  public final void a(String paramString, Animation paramAnimation)
  {
    if (this.hF == null);
    TextView localTextView;
    do
    {
      do
      {
        return;
        this.hF.setCustomView(iMi);
        localTextView = (TextView)this.hF.getCustomView().findViewById(i.aUN);
      }
      while (localTextView == null);
      localTextView.clearAnimation();
      if (paramAnimation != null)
        localTextView.startAnimation(paramAnimation);
    }
    while (com.tencent.mm.sdk.platformtools.ch.jb(paramString));
    localTextView.setText(paramString);
  }

  public final void a(boolean paramBoolean, fj paramfj)
  {
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "add search menu");
    ct localct = new ct();
    localct.iMu = i.aDT;
    localct.iMv = h.QO;
    localct.fUd = null;
    localct.eRi = null;
    oS(localct.iMu);
    this.iLW.add(0, localct);
    this.iLU = paramBoolean;
    this.fqB = paramfj;
    this.hE.n();
  }

  protected abstract boolean aPD();

  public boolean aPE()
  {
    return false;
  }

  public final int aPF()
  {
    return this.iMj;
  }

  public abstract void aPG();

  public final View aPH()
  {
    return this.iLG;
  }

  public final ActionBarActivity aPI()
  {
    return this.hE;
  }

  public final boolean aPK()
  {
    if ((this.iLV != null) && (this.iLV.ebT))
    {
      a(null, this.iLV);
      return true;
    }
    return false;
  }

  protected abstract String aPL();

  public final void aPO()
  {
    if (this.iLW.isEmpty())
      return;
    this.iLW.clear();
    this.hE.n();
  }

  public final void aPP()
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    if (this.hF != null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "hideTitleView hasTitle:%b", arrayOfObject);
      if (this.hF != null)
        break;
      return;
      bool = false;
    }
    this.hF.hide();
  }

  public final void aPQ()
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    if (this.hF != null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "showTitleView hasTitle:%b", arrayOfObject);
      if (this.hF != null)
        break;
      return;
      bool = false;
    }
    this.hF.show();
  }

  public final boolean aPR()
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    if (this.hF != null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "isTitleShowing hasTitle:%b", arrayOfObject);
      if (this.hF != null)
        break;
      return false;
      bool = false;
    }
    return this.hF.isShowing();
  }

  public final int aPS()
  {
    if (this.hF == null)
      return 0;
    return this.hF.getHeight();
  }

  public final void aPU()
  {
    this.iMd.setVisibility(0);
    this.iMc.setVisibility(8);
    this.iMb.setVisibility(8);
  }

  public final boolean aPV()
  {
    return (this.hF != null) && (this.hF.getCustomView() != null) && (this.hF.getCustomView().findViewById(i.aUN) != null);
  }

  public final void aPW()
  {
    if (this.hE != null)
      a(this.hE);
  }

  protected abstract View aPX();

  public final boolean aPY()
  {
    return this.iLK;
  }

  public final boolean aPZ()
  {
    return this.iLq;
  }

  public final void aX(int paramInt1, int paramInt2)
  {
    if (this.hF == null)
      return;
    this.iLM = 0;
    this.iLO = null;
    if (paramInt2 == 0)
    {
      this.iLN = 0;
      this.iLP = null;
    }
    while (true)
    {
      aQa();
      return;
      if (this.iLN != paramInt2)
      {
        this.iLN = paramInt2;
        this.iLP = aY(this.hE.getResources().getDimensionPixelSize(com.tencent.mm.g.Pl), this.iLN);
      }
    }
  }

  public final void aZ(int paramInt1, int paramInt2)
  {
    ct localct = oW(2);
    if ((localct != null) && (localct.iMv != paramInt2))
    {
      localct.iMv = paramInt2;
      this.hE.n();
    }
  }

  public final void aep()
  {
    ActionBarActivity localActionBarActivity = this.hE;
    InputMethodManager localInputMethodManager = (InputMethodManager)localActionBarActivity.getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      View localView = localActionBarActivity.getCurrentFocus();
      if ((localView != null) && (localView.getWindowToken() != null))
        localInputMethodManager.toggleSoftInput(0, 2);
    }
  }

  public final void ak(View paramView)
  {
    if (paramView == null);
    InputMethodManager localInputMethodManager;
    IBinder localIBinder;
    do
    {
      do
      {
        return;
        localInputMethodManager = (InputMethodManager)this.hE.getSystemService("input_method");
      }
      while (localInputMethodManager == null);
      localIBinder = paramView.getWindowToken();
    }
    while (localIBinder == null);
    localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
  }

  public final void av(boolean paramBoolean)
  {
    boolean bool1 = true;
    this.iLK = paramBoolean;
    if ((this.iLF == null) && (this.epk != null))
      this.iLF = this.epk.findViewById(i.aEw);
    if (this.iLF == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "jacks error npe translayer !");
      return;
    }
    View localView1 = this.iLF;
    boolean bool2;
    View localView2;
    if (!paramBoolean)
    {
      bool2 = bool1;
      localView1.setFocusable(bool2);
      localView2 = this.iLF;
      if (paramBoolean)
        break label112;
    }
    while (true)
    {
      localView2.setFocusableInTouchMode(bool1);
      if (paramBoolean)
        break label117;
      this.iLF.setVisibility(0);
      this.iLF.requestFocus();
      return;
      bool2 = false;
      break;
      label112: bool1 = false;
    }
    label117: this.iLF.setVisibility(8);
  }

  protected abstract void axa();

  public final void eA(boolean paramBoolean)
  {
    if (this.iLV == null);
    while (this.iLV.ebT == paramBoolean)
      return;
    this.iLV.ebT = paramBoolean;
    this.hE.n();
  }

  public final void eB(boolean paramBoolean)
  {
    a(true, -1, paramBoolean);
  }

  public final void eC(boolean paramBoolean)
  {
    b(true, -1, paramBoolean);
  }

  public final void ey(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.hF != null)
        this.hF.hide();
      this.eRb.removeCallbacks(this.iMn);
      this.eRb.removeCallbacks(this.iMm);
      this.eRb.postDelayed(this.iMm, 256L);
      return;
    }
    this.hE.getWindow().clearFlags(1024);
    this.eRb.removeCallbacks(this.iMm);
    this.eRb.removeCallbacks(this.iMn);
    this.eRb.postDelayed(this.iMn, 256L);
  }

  public final void ez(boolean paramBoolean)
  {
    int i = 8;
    if (this.hF == null);
    do
    {
      return;
      this.hF.setDisplayHomeAsUpEnabled(paramBoolean);
    }
    while ((this.iMb == null) || (this.iMd == null));
    View localView1 = this.iMb;
    int j;
    View localView2;
    if (paramBoolean)
    {
      j = 0;
      localView1.setVisibility(j);
      localView2 = this.iMd;
      if (!paramBoolean)
        break label74;
    }
    while (true)
    {
      localView2.setVisibility(i);
      return;
      j = i;
      break;
      label74: i = 0;
    }
  }

  protected abstract String getClassName();

  protected final View getContentView()
  {
    return this.epk;
  }

  protected abstract int getLayoutId();

  public final int getStreamMaxVolume(int paramInt)
  {
    return this.dHi.getStreamMaxVolume(3);
  }

  public final int getStreamVolume(int paramInt)
  {
    return this.dHi.getStreamVolume(3);
  }

  public final void oM(int paramInt)
  {
    if (this.epk == null)
      return;
    if (this.iLJ == null)
      this.iLJ = ((FrameLayout)this.epk.findViewById(i.aEn));
    this.iLJ.setBackgroundResource(paramInt);
    this.iLG.setBackgroundResource(paramInt);
  }

  protected final void oN(int paramInt)
  {
    if (this.iLJ == null)
      this.iLJ = ((FrameLayout)this.epk.findViewById(i.aEn));
    if (this.iLH != null)
      this.iLJ.removeView(this.iLH);
    this.iLJ.removeView(this.iLG);
    this.iLG = ((LayoutInflater)this.hE.getSystemService("layout_inflater")).inflate(paramInt, null);
    this.iLJ.addView(this.iLG, 0, new FrameLayout.LayoutParams(-1, -1));
    if (this.iLH != null)
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, e.a(this.hE, 47.0F));
      this.iLJ.addView(this.iLH, this.iLJ.getChildCount(), localLayoutParams);
    }
    this.iLJ.invalidate();
  }

  public final void oO(int paramInt)
  {
    if (this.hF == null)
      return;
    if (paramInt == 0)
    {
      this.hF.show();
      return;
    }
    this.hF.hide();
  }

  public final void oP(int paramInt)
  {
    Bt(this.hE.getString(paramInt));
  }

  public final void oQ(int paramInt)
  {
    if (this.hF == null)
      return;
    this.iMe.setText(this.hE.getString(paramInt));
    this.iMe.setVisibility(0);
    Bv(this.hE.getString(paramInt));
  }

  public final boolean oS(int paramInt)
  {
    for (int i = 0; ; i++)
    {
      int j = this.iLW.size();
      boolean bool = false;
      if (i < j)
      {
        if (((ct)this.iLW.get(i)).iMu == paramInt)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(paramInt);
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "match menu, id %d, remove it", arrayOfObject);
          this.iLW.remove(i);
          this.hE.n();
          bool = true;
        }
      }
      else
        return bool;
    }
  }

  public final void oT(int paramInt)
  {
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      this.iLS = bool;
      aQa();
      return;
    }
  }

  public final boolean oU(int paramInt)
  {
    Iterator localIterator = this.iLW.iterator();
    while (localIterator.hasNext())
    {
      ct localct = (ct)localIterator.next();
      if (localct.iMu == 0)
        return localct.ebT;
    }
    return false;
  }

  public final boolean oV(int paramInt)
  {
    Iterator localIterator = this.iLW.iterator();
    while (localIterator.hasNext())
    {
      ct localct = (ct)localIterator.next();
      if (localct.iMu == 0)
        return localct.visible;
    }
    return false;
  }

  public final void oX(int paramInt)
  {
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      this.iLT = bool;
      aQa();
      return;
    }
  }

  public final boolean onCreateOptionsMenu(Menu paramMenu)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.iLW.size());
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "on create option menu, menuCache size:%d", arrayOfObject1);
    if ((this.hF == null) || (this.iLW.size() == 0))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(this.iLW.size());
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "error, mActionBar is null or cache size:%d", arrayOfObject2);
      return false;
    }
    this.iMk = null;
    this.iMl = null;
    int i = this.hF.getHeight();
    int j;
    if (i == 0)
    {
      DisplayMetrics localDisplayMetrics = this.hE.getResources().getDisplayMetrics();
      if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
        j = this.hE.getResources().getDimensionPixelSize(com.tencent.mm.g.Pr);
    }
    while (true)
    {
      Iterator localIterator = this.iLW.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          ct localct = (ct)localIterator.next();
          if (localct.iMu == 16908332)
          {
            com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "match back option menu, continue");
            continue;
            j = this.hE.getResources().getDimensionPixelSize(com.tencent.mm.g.Ps);
            break;
          }
          if (localct.iMu == i.aDT)
          {
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = Boolean.valueOf(this.iLU);
            if (this.fqB == null);
            for (boolean bool = true; ; bool = false)
            {
              arrayOfObject4[1] = Boolean.valueOf(bool);
              com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "match search menu, enable search view[%B], search view helper is null[%B]", arrayOfObject4);
              if ((!this.iLU) || (this.fqB == null))
                break;
              this.fqB.b(this.hE, paramMenu);
              break;
            }
          }
          MenuItem localMenuItem = paramMenu.add(0, localct.iMu, 0, localct.text);
          com.tencent.mm.compatible.f.a.a(localMenuItem, getClass().getName());
          cp localcp = new cp(this, localMenuItem, localct);
          cq localcq = new cq(this, localct);
          if (localct.iMv != 0)
          {
            Object localObject;
            if (localct.eRi != null)
            {
              int k = com.tencent.mm.aq.a.fromDPToPix(this.hE, 56);
              if (localct.iMx == null)
              {
                localObject = new ImageButton(this.hE);
                ((View)localObject).setLayoutParams(new ViewGroup.LayoutParams(k, j));
                ((View)localObject).setBackgroundResource(h.QK);
                ((View)localObject).setMinimumHeight(j);
                ((View)localObject).setMinimumWidth(k);
                localct.iMx = ((View)localObject);
                label451: ((ImageButton)localObject).setImageResource(localct.iMv);
                android.support.v4.view.z.a(localMenuItem, (View)localObject);
                ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
                localLayoutParams.width = k;
                localLayoutParams.height = j;
                ((View)localObject).setOnClickListener(localcp);
                ((View)localObject).setOnLongClickListener(localcq);
                ((View)localObject).setEnabled(localct.ebT);
                ((View)localObject).setContentDescription(localct.text);
              }
            }
            while (true)
            {
              localMenuItem.setEnabled(localct.ebT);
              localMenuItem.setVisible(localct.visible);
              android.support.v4.view.z.a(localMenuItem, 2);
              if (localct.iMv == h.WS)
              {
                this.iMk = localct;
                this.iMl = localMenuItem;
              }
              Object[] arrayOfObject3 = new Object[4];
              arrayOfObject3[0] = Integer.valueOf(localct.iMu);
              arrayOfObject3[1] = localct.text;
              arrayOfObject3[2] = Boolean.valueOf(localct.ebT);
              arrayOfObject3[3] = Boolean.valueOf(localct.visible);
              com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "set %d %s option menu enable %B, visible %B", arrayOfObject3);
              break;
              localObject = localct.iMx;
              break label451;
              localMenuItem.setIcon(localct.iMv);
            }
          }
          if (localct.iMw == null)
            localct.iMw = View.inflate(this.hE, k.bax, null);
          TextView localTextView;
          if (localct.iMy == cu.iMB)
          {
            localct.iMw.findViewById(i.aen).setVisibility(8);
            localct.iMw.findViewById(i.divider).setVisibility(8);
            localTextView = (TextView)localct.iMw.findViewById(i.aeo);
            localTextView.setBackgroundResource(h.Tb);
            localTextView.setPadding(this.eWW, 0, this.eWW, 0);
          }
          while (true)
          {
            localTextView.setVisibility(0);
            localTextView.setText(localct.text);
            localTextView.setOnClickListener(localcp);
            localTextView.setOnLongClickListener(localcq);
            localTextView.setEnabled(localct.ebT);
            android.support.v4.view.z.a(localMenuItem, localct.iMw);
            break;
            if (localct.iMy == cu.iMA)
            {
              localct.iMw.findViewById(i.aen).setVisibility(8);
              localct.iMw.findViewById(i.divider).setVisibility(8);
              localTextView = (TextView)localct.iMw.findViewById(i.aeo);
              localTextView.setBackgroundResource(h.SZ);
              localTextView.setPadding(this.eWW, 0, this.eWW, 0);
            }
            else
            {
              localct.iMw.findViewById(i.aeo).setVisibility(8);
              localct.iMw.findViewById(i.divider).setVisibility(0);
              localTextView = (TextView)localct.iMw.findViewById(i.aen);
            }
          }
        }
      return true;
      j = i;
    }
  }

  public final void onDestroy()
  {
    if (this.iLY != null)
    {
      int i = this.iLY.size();
      for (int j = 0; j < i; j++)
      {
        Dialog localDialog = (Dialog)this.iLY.get(j);
        if ((localDialog != null) && (localDialog.isShowing()))
          localDialog.dismiss();
      }
      this.iLY.clear();
      this.iLY = null;
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 25) && (this.dHi != null))
    {
      int k = this.dHi.getStreamVolume(3);
      int m = this.gQF / 7;
      if (m == 0)
        m = 1;
      this.dHi.setStreamVolume(3, k - m, 5);
      return true;
    }
    if ((paramInt == 24) && (this.dHi != null))
    {
      int i = this.dHi.getStreamVolume(3);
      if (i >= this.gQF)
      {
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "has set the max volume");
        return true;
      }
      int j = this.gQF / 7;
      if (j == 0)
        j = 1;
      this.dHi.setStreamVolume(3, j + i, 5);
      return true;
    }
    if ((this.iLU) && (this.fqB != null) && (this.fqB.onKeyDown(paramInt, paramKeyEvent)))
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "match search view on key down");
      return true;
    }
    return false;
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
    {
      if ((this.iMk != null) && (this.iMk.ebT))
        a(this.iMl, this.iMk);
      return true;
    }
    return false;
  }

  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "on options item selected");
    if (!this.iLK)
    {
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "onOptionsItemSelected screen not enable.");
      return true;
    }
    if ((paramMenuItem.getItemId() == this.iLV.iMu) && (this.iLV.ebT))
    {
      a(paramMenuItem, this.iLV);
      return true;
    }
    Iterator localIterator = this.iLW.iterator();
    while (localIterator.hasNext())
    {
      ct localct = (ct)localIterator.next();
      if (paramMenuItem.getItemId() == localct.iMu)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramMenuItem.getItemId());
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "on option menu %d click", arrayOfObject);
        a(paramMenuItem, localct);
        return true;
      }
    }
    return false;
  }

  public final void onPause()
  {
    eD(false);
    com.tencent.mm.sdk.c.a.aGB().b("UINotify", this.iMg);
  }

  public final boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "on prepare option menu");
    if ((this.iLU) && (this.fqB != null))
      this.fqB.a(this.hE, paramMenu);
    return true;
  }

  public final void onResume()
  {
    eD(true);
    com.tencent.mm.sdk.c.a.aGB().a("UINotify", this.iMg);
    t localt = new t();
    localt.cHt.type = 2;
    com.tencent.mm.sdk.c.a.aGB().g(localt);
    if (localt.cHu.cHx == 2)
    {
      long l = System.currentTimeMillis();
      a(localt.cHu.cHy, localt.cHu.visible, localt.cHu.url, localt.cHu.desc, true);
      com.tencent.mm.sdk.platformtools.z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN MMActivity onResume initNotifyView:" + (System.currentTimeMillis() - l));
    }
  }

  public final void onStart()
  {
    this.iLq = this.hE.getSharedPreferences(ak.aHi(), 0).getBoolean("settings_landscape_mode", false);
    if (this.iLq)
    {
      this.hE.setRequestedOrientation(-1);
      return;
    }
    this.hE.setRequestedOrientation(1);
  }

  public final void s(Runnable paramRunnable)
  {
    if ((this.hF == null) || (paramRunnable == null))
      return;
    this.hF.getCustomView().setOnClickListener(new ci(this, paramRunnable));
  }

  public final void t(int paramInt, boolean paramBoolean)
  {
    a(false, paramInt, paramBoolean);
  }

  public final void u(int paramInt, boolean paramBoolean)
  {
    b(false, paramInt, paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.cg
 * JD-Core Version:    0.6.2
 */