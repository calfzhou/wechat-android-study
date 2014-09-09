package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.ar.b;
import com.tencent.mm.f;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MMTagPanel extends FlowLayout
{
  private boolean eQn = false;
  private int eRw = f.OD;
  private int eRx = h.abA;
  private int gkI;
  private LinkedList hZF = new LinkedList();
  private boolean jcg = true;
  private boolean jch = false;
  private boolean jci = true;
  private boolean jcj = false;
  private boolean jck = false;
  private int jcl = h.abw;
  private int jcm = 0;
  private int jcn = h.aby;
  private int jco = f.Ph;
  private int jcp = h.abz;
  private int jcq = f.white;
  private ei jcr = null;
  private LinkedList jcs = new LinkedList();
  private eb jct;
  private View jcu;
  private EditText jcv;
  private View.OnClickListener jcw = new dx(this);
  public boolean jcx = true;

  public MMTagPanel(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MMTagPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public MMTagPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void init()
  {
    this.gkI = getContext().getResources().getDimensionPixelSize(g.Pz);
    this.jcu = LayoutInflater.from(getContext()).inflate(k.bjJ, null);
    this.jcv = ((EditText)this.jcu.findViewById(i.aqy));
    this.jcv.setOnKeyListener(new dr(this));
    this.jcv.addTextChangedListener(new ds(this));
    this.jcv.setOnFocusChangeListener(new dt(this));
    this.jcv.setOnClickListener(new du(this));
    eg localeg = new eg(this);
    ec localec = new ec(this);
    this.jcv.setFilters(new InputFilter[] { localeg, localec });
    aSG();
    setOnClickListener(new dv(this));
    setOnTouchListener(new dw(this, localeg));
  }

  public final void BR(String paramString)
  {
    if (this.jcv != null)
      this.jcv.setHint(paramString);
  }

  public final void P(String paramString, boolean paramBoolean)
  {
    if (ch.jb(paramString))
    {
      z.w("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "want to add tag, but it is null or empty");
      return;
    }
    String str = paramString.trim();
    z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "want to add tag %s, do remove tag first", new Object[] { str });
    ml(str);
    Iterator localIterator = this.hZF.iterator();
    while (localIterator.hasNext())
      if (str.equals(((ei)localIterator.next()).jcL))
      {
        z.w("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "want to add tag %s, but it exsited!", new Object[] { str });
        return;
      }
    ei localei = aSN();
    a(localei, str, paramBoolean);
    this.hZF.add(localei);
    if (this.jch)
      addView(localei.jcM, -1 + getChildCount());
    while (true)
    {
      aSO();
      return;
      addView(localei.jcM);
    }
  }

  public final void Q(String paramString, boolean paramBoolean)
  {
    if (ch.jb(paramString))
    {
      z.w("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "want to update tag status, but it is null or empty");
      return;
    }
    Iterator localIterator = this.hZF.iterator();
    while (localIterator.hasNext())
    {
      ei localei = (ei)localIterator.next();
      if (paramString.equals(localei.jcL))
      {
        a(localei, paramString, paramBoolean);
        aSO();
        return;
      }
    }
    z.w("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "want to update tag %s status, but it not exsited!", new Object[] { paramString });
  }

  public final void Si()
  {
    if ((this.jcv == null) || (this.jcv.isFocused()))
      return;
    this.jcv.requestFocus();
  }

  protected void Sj()
  {
  }

  protected final void a(TextView paramTextView, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      paramTextView.setBackgroundResource(this.jcp);
      paramTextView.setTextColor(getResources().getColor(this.jcq));
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.jcl, 0);
      return;
    }
    if (paramBoolean1)
    {
      paramTextView.setTag(Integer.valueOf(1));
      paramTextView.setBackgroundResource(this.jcn);
      paramTextView.setTextColor(getResources().getColor(this.jco));
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      return;
    }
    paramTextView.setTag(Integer.valueOf(0));
    paramTextView.setBackgroundResource(this.eRx);
    paramTextView.setTextColor(getResources().getColor(this.eRw));
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
  }

  public final void a(eb parameb)
  {
    this.jct = parameb;
  }

  protected final void a(ei paramei)
  {
    paramei.jcM.setOnClickListener(null);
    if (this.jcs.size() >= 16)
      return;
    this.jcs.add(paramei);
  }

  protected final void a(ei paramei, String paramString, boolean paramBoolean)
  {
    paramei.jcL = paramString;
    TextView localTextView1 = paramei.jcM;
    localTextView1.setText(b.e(getContext(), paramString, this.gkI));
    TextView localTextView2 = paramei.jcM;
    if (this.jcg);
    for (View.OnClickListener localOnClickListener = this.jcw; ; localOnClickListener = null)
    {
      localTextView2.setOnClickListener(localOnClickListener);
      a(paramei.jcM, paramBoolean, false);
      return;
    }
  }

  public final void a(Collection paramCollection, List paramList)
  {
    aSs();
    if (this.jch)
      addView(this.jcu);
    if ((paramList == null) || (paramList.isEmpty()))
      return;
    Iterator localIterator = paramList.iterator();
    label40: String str;
    if (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (paramCollection != null)
        break label78;
    }
    label78: for (boolean bool = false; ; bool = paramCollection.contains(str))
    {
      P(str, bool);
      break label40;
      break;
    }
  }

  public final void aSB()
  {
    this.jcl = 0;
  }

  public final void aSC()
  {
    this.jcp = 0;
  }

  public final String aSD()
  {
    if (this.jcv != null)
      return this.jcv.getText().toString();
    return "";
  }

  public final void aSE()
  {
    if (this.jcv != null)
      this.jcv.setText("");
  }

  public final boolean aSF()
  {
    if (this.jcv == null)
      return false;
    return this.jcv.isFocused();
  }

  public final void aSG()
  {
    InputMethodManager localInputMethodManager;
    if ((this.jcv != null) && (this.jcv.isFocused()))
    {
      z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "do clear edit focus");
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
        break label44;
    }
    label44: IBinder localIBinder;
    do
    {
      return;
      localIBinder = this.jcv.getWindowToken();
    }
    while (localIBinder == null);
    localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
    this.jcv.clearFocus();
  }

  public final void aSH()
  {
    this.jci = false;
  }

  public final void aSI()
  {
    this.jcg = false;
  }

  public final void aSJ()
  {
    this.jcj = true;
  }

  public final void aSK()
  {
    this.jck = true;
  }

  public final ArrayList aSL()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.hZF.iterator();
    while (localIterator.hasNext())
    {
      ei localei = (ei)localIterator.next();
      if (!ch.jb(localei.jcL))
        localArrayList.add(localei.jcL);
    }
    return localArrayList;
  }

  public final int aSM()
  {
    return this.hZF.size();
  }

  protected final ei aSN()
  {
    if (!this.jcs.isEmpty())
      return (ei)this.jcs.removeFirst();
    ei localei = new ei();
    TextView localTextView = new TextView(getContext());
    localTextView.setBackgroundResource(this.eRx);
    localTextView.setTextColor(getResources().getColor(this.eRw));
    localTextView.setTag(Integer.valueOf(0));
    localTextView.setGravity(17);
    localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.jcl, 0);
    if (this.jcg);
    for (View.OnClickListener localOnClickListener = this.jcw; ; localOnClickListener = null)
    {
      localTextView.setOnClickListener(localOnClickListener);
      localTextView.setEllipsize(TextUtils.TruncateAt.END);
      localTextView.setSingleLine();
      localei.jcM = localTextView;
      return localei;
    }
  }

  protected final void aSO()
  {
    if (this.jcv != null)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(this.jcv.isFocused());
      z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "do clear high light info, edittext is focus %B", arrayOfObject);
      this.jcv.setCursorVisible(true);
    }
    if (this.jcr == null)
      return;
    TextView localTextView = this.jcr.jcM;
    if (((Integer)this.jcr.jcM.getTag()).intValue() == 1);
    for (boolean bool = true; ; bool = false)
    {
      a(localTextView, bool, false);
      this.jcr = null;
      return;
    }
  }

  public final void aSP()
  {
    Iterator localIterator = this.hZF.iterator();
    while (localIterator.hasNext())
    {
      ei localei = (ei)localIterator.next();
      removeView(localei.jcM);
      a(localei);
    }
    this.hZF.clear();
    aSO();
  }

  public void aSs()
  {
    this.hZF.clear();
    removeAllViews();
    Iterator localIterator = this.hZF.iterator();
    while (localIterator.hasNext())
      a((ei)localIterator.next());
  }

  public final void eV(boolean paramBoolean)
  {
    if (paramBoolean == this.jch);
    do
    {
      return;
      this.jch = paramBoolean;
      removeView(this.jcu);
    }
    while (!this.jch);
    addView(this.jcu);
    aSG();
  }

  public final void ml(String paramString)
  {
    if (ch.jb(paramString))
    {
      z.w("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "want to remove tag, but it is null or empty");
      return;
    }
    Iterator localIterator = this.hZF.iterator();
    while (localIterator.hasNext())
    {
      ei localei = (ei)localIterator.next();
      if (paramString.equals(localei.jcL))
      {
        this.hZF.remove(localei);
        removeView(localei.jcM);
        a(localei);
        aSO();
        return;
      }
    }
    z.w("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "want to remove tag %s, but it not exsited!", new Object[] { paramString });
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.jcx)
      return super.onInterceptTouchEvent(paramMotionEvent);
    return true;
  }

  public final void pF(int paramInt)
  {
    this.jcm = paramInt;
    if (this.jcv != null)
    {
      int i = a.fromDPToPix(getContext(), 6);
      int j = getResources().getDimensionPixelSize(g.PH);
      this.jcv.setBackgroundResource(this.jcm);
      this.jcv.setPadding(j, i, j, i);
    }
  }

  public final void pG(int paramInt)
  {
    this.eRx = paramInt;
  }

  public final void pH(int paramInt)
  {
    this.eRw = paramInt;
  }

  public final void pI(int paramInt)
  {
    this.jcn = paramInt;
  }

  public final void pJ(int paramInt)
  {
    this.jco = paramInt;
  }

  public final void pK(int paramInt)
  {
    if (this.jcv != null)
      this.jcv.setTextColor(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel
 * JD-Core Version:    0.6.2
 */