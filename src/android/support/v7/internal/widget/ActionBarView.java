package android.support.v7.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.support.v7.internal.view.menu.af;
import android.support.v7.internal.view.menu.o;
import android.support.v7.internal.view.menu.s;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.d;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.p;

public class ActionBarView extends a
{
  private ActionBarContextView ic;
  private ScrollingTabContainerView jdField_if;
  private Drawable iw;
  private CharSequence jz;
  private TextView kH;
  private Context mContext;
  private LinearLayout mE;
  private int mF;
  private int mG;
  private int mL;
  private int mM = -1;
  private CharSequence mN;
  private Drawable mO;
  private ActionBarView.HomeView mP;
  private ActionBarView.HomeView mQ;
  private TextView mR;
  private View mS;
  private ap mT;
  private LinearLayout mU;
  private View mV;
  private ProgressBarICS mW;
  private ProgressBarICS mX;
  private int mY;
  private int mZ;
  private int na;
  private int nb;
  private boolean nc;
  private boolean nd;
  private boolean ne;
  private boolean nf;
  private o ng;
  private android.support.v7.internal.view.menu.a nh;
  private android.support.v7.app.b ni;
  private Runnable nj;
  private h nk;
  View nl;
  Window.Callback nm;
  private final y nn = new e(this);
  private final View.OnClickListener no = new f(this);
  private final View.OnClickListener np = new g(this);

  public ActionBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    setBackgroundResource(0);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cuS, d.actionBarStyle, 0);
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    PackageManager localPackageManager = paramContext.getPackageManager();
    this.mL = localTypedArray.getInt(p.cve, 0);
    this.jz = localTypedArray.getText(p.cvj);
    this.mN = localTypedArray.getText(p.cvh);
    this.mO = localTypedArray.getDrawable(p.cvd);
    if ((this.mO != null) || (Build.VERSION.SDK_INT < 9) || ((paramContext instanceof Activity)));
    try
    {
      this.mO = localPackageManager.getActivityLogo(((Activity)paramContext).getComponentName());
      label165: if (this.mO == null)
        this.mO = localApplicationInfo.loadLogo(localPackageManager);
      this.iw = localTypedArray.getDrawable(p.cva);
      if ((this.iw != null) || ((paramContext instanceof Activity)));
      try
      {
        this.iw = localPackageManager.getActivityIcon(((Activity)paramContext).getComponentName());
        label224: if (this.iw == null)
          this.iw = localApplicationInfo.loadIcon(localPackageManager);
        LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
        int i = localTypedArray.getResourceId(p.cuZ, k.bai);
        this.mP = ((ActionBarView.HomeView)localLayoutInflater.inflate(i, this, false));
        this.mQ = ((ActionBarView.HomeView)localLayoutInflater.inflate(i, this, false));
        this.mQ.v(true);
        this.mQ.setOnClickListener(this.no);
        this.mQ.setContentDescription(getResources().getText(n.bro));
        this.mF = localTypedArray.getResourceId(p.cvk, 0);
        this.mG = localTypedArray.getResourceId(p.cvi, 0);
        this.na = localTypedArray.getResourceId(p.cvg, 0);
        this.nb = localTypedArray.getResourceId(p.cvb, 0);
        this.mY = localTypedArray.getDimensionPixelOffset(p.cvf, 0);
        this.mZ = localTypedArray.getDimensionPixelOffset(p.cvc, 0);
        setDisplayOptions(localTypedArray.getInt(p.cuX, 0));
        int j = localTypedArray.getResourceId(p.cuW, 0);
        if (j != 0)
        {
          this.mV = localLayoutInflater.inflate(j, this, false);
          this.mL = 0;
          setDisplayOptions(0x10 | this.mM);
        }
        this.mi = localTypedArray.getLayoutDimension(p.cuY, 0);
        localTypedArray.recycle();
        this.nh = new android.support.v7.internal.view.menu.a(paramContext, this.jz);
        this.mP.setOnClickListener(this.np);
        this.mP.setClickable(true);
        this.mP.setFocusable(true);
        return;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        break label224;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      break label165;
    }
  }

  private void cw()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label200: int i;
    label217: LinearLayout localLinearLayout;
    if (this.mE == null)
    {
      this.mE = ((LinearLayout)LayoutInflater.from(getContext()).inflate(k.bal, this, false));
      this.kH = ((TextView)this.mE.findViewById(i.aek));
      this.mR = ((TextView)this.mE.findViewById(i.aej));
      this.mS = this.mE.findViewById(i.aTW);
      this.mE.setOnClickListener(this.np);
      if (this.mF != 0)
        this.kH.setTextAppearance(this.mContext, this.mF);
      if (this.jz != null)
        this.kH.setText(this.jz);
      if (this.mG != 0)
        this.mR.setTextAppearance(this.mContext, this.mG);
      if (this.mN != null)
      {
        this.mR.setText(this.mN);
        this.mR.setVisibility(0);
      }
      if ((0x4 & this.mM) == 0)
        break label289;
      bool2 = bool1;
      if ((0x2 & this.mM) == 0)
        break label294;
      bool3 = bool1;
      View localView = this.mS;
      if (bool3)
        break label305;
      if (!bool2)
        break label299;
      i = 0;
      localView.setVisibility(i);
      localLinearLayout = this.mE;
      if ((!bool2) || (bool3))
        break label312;
    }
    while (true)
    {
      localLinearLayout.setEnabled(bool1);
      addView(this.mE);
      if ((this.nl != null) || ((TextUtils.isEmpty(this.jz)) && (TextUtils.isEmpty(this.mN))))
        this.mE.setVisibility(8);
      return;
      label289: bool2 = false;
      break;
      label294: bool3 = false;
      break label200;
      label299: i = 4;
      break label217;
      label305: i = 8;
      break label217;
      label312: bool1 = false;
    }
  }

  private void e(o paramo)
  {
    if (paramo != null)
    {
      paramo.a(this.mf);
      paramo.a(this.nk);
    }
    while (true)
    {
      this.mf.j(true);
      this.nk.j(true);
      return;
      this.mf.a(this.mContext, null);
      this.nk.a(this.mContext, null);
    }
  }

  private void g(CharSequence paramCharSequence)
  {
    this.jz = paramCharSequence;
    int i;
    LinearLayout localLinearLayout;
    int j;
    if (this.kH != null)
    {
      this.kH.setText(paramCharSequence);
      if ((this.nl != null) || ((0x8 & this.mM) == 0) || ((TextUtils.isEmpty(this.jz)) && (TextUtils.isEmpty(this.mN))))
        break label96;
      i = 1;
      localLinearLayout = this.mE;
      j = 0;
      if (i == 0)
        break label101;
    }
    while (true)
    {
      localLinearLayout.setVisibility(j);
      if (this.nh != null)
        this.nh.setTitle(paramCharSequence);
      return;
      label96: i = 0;
      break;
      label101: j = 8;
    }
  }

  public final void G(View paramView)
  {
    if ((0x10 & this.mM) != 0);
    for (int i = 1; ; i = 0)
    {
      if ((this.mV != null) && (i != 0))
        removeView(this.mV);
      this.mV = paramView;
      if ((this.mV != null) && (i != 0))
        addView(this.mV);
      return;
    }
  }

  public final void a(android.support.v4.a.a.a parama, af paramaf)
  {
    if (parama == this.ng)
      return;
    if (this.ng != null)
    {
      this.ng.b(this.mf);
      this.ng.b(this.nk);
    }
    o localo = (o)parama;
    this.ng = localo;
    if (this.me != null)
    {
      ViewGroup localViewGroup3 = (ViewGroup)this.me.getParent();
      if (localViewGroup3 != null)
        localViewGroup3.removeView(this.me);
    }
    if (this.mf == null)
    {
      this.mf = new ActionMenuPresenter(this.mContext);
      this.mf.a(paramaf);
      this.mf.setId(i.aem);
      this.nk = new h(this, (byte)0);
    }
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
    ActionMenuView localActionMenuView;
    if (!this.mg)
    {
      this.mf.i(getResources().getBoolean(com.tencent.mm.e.NL));
      e(localo);
      localActionMenuView = (ActionMenuView)this.mf.b(this);
      ViewGroup localViewGroup2 = (ViewGroup)localActionMenuView.getParent();
      if ((localViewGroup2 != null) && (localViewGroup2 != this))
        localViewGroup2.removeView(localActionMenuView);
      addView(localActionMenuView, localLayoutParams);
    }
    while (true)
    {
      this.me = localActionMenuView;
      return;
      this.mf.i(false);
      this.mf.x(getContext().getResources().getDisplayMetrics().widthPixels);
      this.mf.bu();
      localLayoutParams.width = -1;
      e(localo);
      localActionMenuView = (ActionMenuView)this.mf.b(this);
      if (this.ie != null)
      {
        ViewGroup localViewGroup1 = (ViewGroup)localActionMenuView.getParent();
        if ((localViewGroup1 != null) && (localViewGroup1 != this.ie))
          localViewGroup1.removeView(localActionMenuView);
        localActionMenuView.setVisibility(super.cm());
        this.ie.addView(localActionMenuView, localLayoutParams);
      }
      else
      {
        localActionMenuView.setLayoutParams(localLayoutParams);
      }
    }
  }

  public final void a(ActionBarContextView paramActionBarContextView)
  {
    this.ic = paramActionBarContextView;
  }

  public final void a(Window.Callback paramCallback)
  {
    this.nm = paramCallback;
  }

  public final void b(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    if (this.jdField_if != null)
      removeView(this.jdField_if);
    this.jdField_if = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null);
    for (boolean bool = true; ; bool = false)
    {
      this.nd = bool;
      if ((this.nd) && (this.mL == 2))
      {
        addView(this.jdField_if);
        ViewGroup.LayoutParams localLayoutParams = this.jdField_if.getLayoutParams();
        localLayoutParams.width = -2;
        localLayoutParams.height = -1;
        paramScrollingTabContainerView.x(true);
      }
      return;
    }
  }

  public final void cq()
  {
    this.mW = new ProgressBarICS(this.mContext, this.na);
    this.mW.setId(i.progress_horizontal);
    this.mW.setMax(10000);
    this.mW.setVisibility(8);
    addView(this.mW);
  }

  public final void cr()
  {
    this.mX = new ProgressBarICS(this.mContext, this.nb);
    this.mX.setId(i.aIA);
    this.mX.setVisibility(8);
    addView(this.mX);
  }

  public final boolean cs()
  {
    return this.mg;
  }

  public final boolean ct()
  {
    return (this.nk != null) && (this.nk.nr != null);
  }

  public final void cu()
  {
    if (this.nk == null);
    for (s locals = null; ; locals = this.nk.nr)
    {
      if (locals != null)
        locals.collapseActionView();
      return;
    }
  }

  public final View cv()
  {
    return this.mV;
  }

  public final boolean cx()
  {
    return this.nf;
  }

  public final void f(CharSequence paramCharSequence)
  {
    if (!this.nc)
      g(paramCharSequence);
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ActionBar.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ActionBar.LayoutParams(getContext(), paramAttributeSet);
  }

  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
      paramLayoutParams = generateDefaultLayoutParams();
    return paramLayoutParams;
  }

  public final int getDisplayOptions()
  {
    return this.mM;
  }

  public final int getNavigationMode()
  {
    return this.mL;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.kH = null;
    this.mR = null;
    this.mS = null;
    if ((this.mE != null) && (this.mE.getParent() == this))
      removeView(this.mE);
    this.mE = null;
    if ((0x8 & this.mM) != 0)
      cw();
    if ((this.jdField_if != null) && (this.nd))
    {
      ViewGroup.LayoutParams localLayoutParams = this.jdField_if.getLayoutParams();
      if (localLayoutParams != null)
      {
        localLayoutParams.width = -2;
        localLayoutParams.height = -1;
      }
      this.jdField_if.x(true);
    }
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.nj);
    if (this.mf != null)
    {
      this.mf.bw();
      this.mf.by();
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    addView(this.mP);
    if ((this.mV != null) && ((0x10 & this.mM) != 0))
    {
      ViewParent localViewParent = this.mV.getParent();
      if (localViewParent != this)
      {
        if ((localViewParent instanceof ViewGroup))
          ((ViewGroup)localViewParent).removeView(this.mV);
        addView(this.mV);
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    if (k <= 0)
      return;
    ActionBarView.HomeView localHomeView;
    label47: int i21;
    if (this.nl != null)
    {
      localHomeView = this.mQ;
      if (localHomeView.getVisibility() == 8)
        break label921;
      i21 = localHomeView.cz();
    }
    label908: label921: for (int m = i + (i21 + a(localHomeView, i + i21, j, k)); ; m = i)
    {
      int i20;
      if (this.nl == null)
      {
        if ((this.mE == null) || (this.mE.getVisibility() == 8) || ((0x8 & this.mM) == 0))
          break label616;
        i20 = 1;
        label125: if (i20 != 0)
          m += a(this.mE, m, j, k);
      }
      label180: int n;
      label184: int i1;
      switch (this.mL)
      {
      default:
        n = m;
        i1 = paramInt3 - paramInt1 - getPaddingRight();
        if ((this.me != null) && (this.me.getParent() == this))
        {
          b(this.me, i1, j, k);
          i1 -= this.me.getMeasuredWidth();
        }
        if ((this.mX != null) && (this.mX.getVisibility() != 8))
          b(this.mX, i1, j, k);
        break;
      case 0:
      case 1:
      case 2:
      }
      for (int i2 = i1 - this.mX.getMeasuredWidth(); ; i2 = i1)
      {
        View localView;
        if (this.nl != null)
          localView = this.nl;
        while (true)
        {
          label297: ActionBar.LayoutParams localLayoutParams1;
          label324: int i4;
          label336: int i5;
          int i9;
          int i6;
          int i7;
          int i8;
          if (localView != null)
          {
            ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
            if (!(localLayoutParams instanceof ActionBar.LayoutParams))
              break label749;
            localLayoutParams1 = (ActionBar.LayoutParams)localLayoutParams;
            if (localLayoutParams1 == null)
              break label755;
            i4 = localLayoutParams1.gravity;
            i5 = localView.getMeasuredWidth();
            if (localLayoutParams1 == null)
              break label891;
            int i16 = n + localLayoutParams1.leftMargin;
            int i17 = i2 - localLayoutParams1.rightMargin;
            int i18 = localLayoutParams1.topMargin;
            int i19 = localLayoutParams1.bottomMargin;
            i9 = i18;
            i6 = i17;
            i7 = i16;
            i8 = i19;
          }
          while (true)
          {
            int i10 = i4 & 0x7;
            int i15;
            int i11;
            if (i10 == 1)
            {
              i15 = (getWidth() - i5) / 2;
              if (i15 < i7)
                i11 = 3;
            }
            while (true)
            {
              label432: label471: int i13;
              switch (i11)
              {
              case 2:
              case 4:
              default:
                i7 = 0;
              case 3:
                int i12 = i4 & 0x70;
                if (i4 == -1)
                  i12 = 16;
                i13 = 0;
                switch (i12)
                {
                default:
                case 16:
                case 48:
                case 80:
                }
                break;
              case 1:
              case 5:
              }
              while (true)
              {
                localView.layout(i7, i13, i7 + localView.getMeasuredWidth(), i13 + localView.getMeasuredHeight());
                if (this.mW == null)
                  break;
                this.mW.bringToFront();
                int i3 = this.mW.getMeasuredHeight() / 2;
                this.mW.layout(this.mY, -i3, this.mY + this.mW.getMeasuredWidth(), i3);
                return;
                localHomeView = this.mP;
                break label47;
                label616: i20 = 0;
                break label125;
                n = m;
                break label184;
                if (this.mU == null)
                  break label180;
                if (i20 != 0)
                  m += this.mZ;
                n = m + (a(this.mU, m, j, k) + this.mZ);
                break label184;
                if (this.jdField_if == null)
                  break label180;
                if (i20 != 0)
                  m += this.mZ;
                n = m + (a(this.jdField_if, m, j, k) + this.mZ);
                break label184;
                if (((0x10 & this.mM) == 0) || (this.mV == null))
                  break label908;
                localView = this.mV;
                break label297;
                label749: localLayoutParams1 = null;
                break label324;
                label755: i4 = 19;
                break label336;
                if (i15 + i5 > i6)
                  i10 = 5;
                i11 = i10;
                break label432;
                if (i4 != -1)
                  break label884;
                i11 = 3;
                break label432;
                i7 = (getWidth() - i5) / 2;
                break label471;
                i7 = i6 - i5;
                break label471;
                int i14 = getPaddingTop();
                i13 = (getHeight() - getPaddingBottom() - i14 - localView.getMeasuredHeight()) / 2;
                continue;
                i13 = i9 + getPaddingTop();
                continue;
                i13 = getHeight() - getPaddingBottom() - localView.getMeasuredHeight() - i8;
              }
              label884: i11 = i10;
            }
            label891: i6 = i2;
            i7 = n;
            i8 = 0;
            i9 = 0;
          }
          localView = null;
        }
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    if (this.ne)
    {
      int i35 = 0;
      for (int i36 = 0; i36 < i; i36++)
      {
        View localView2 = getChildAt(i36);
        if ((localView2.getVisibility() != 8) && ((localView2 != this.me) || (this.me.getChildCount() != 0)))
          i35++;
      }
      if (i35 == 0)
      {
        setMeasuredDimension(0, 0);
        this.nf = true;
        return;
      }
    }
    this.nf = false;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"MATCH_PARENT\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) != -2147483648)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    int j = View.MeasureSpec.getSize(paramInt1);
    int k;
    label199: int m;
    int i2;
    int i3;
    int i4;
    int i5;
    ActionBarView.HomeView localHomeView;
    label268: ViewGroup.LayoutParams localLayoutParams2;
    int i33;
    label303: int i7;
    int i6;
    if (this.mi > 0)
    {
      k = this.mi;
      m = getPaddingTop() + getPaddingBottom();
      int n = getPaddingLeft();
      int i1 = getPaddingRight();
      i2 = k - m;
      i3 = View.MeasureSpec.makeMeasureSpec(i2, -2147483648);
      i4 = j - n - i1;
      i5 = i4 / 2;
      if (this.nl == null)
        break label879;
      localHomeView = this.mQ;
      if (localHomeView.getVisibility() == 8)
        break label1305;
      localLayoutParams2 = localHomeView.getLayoutParams();
      if (localLayoutParams2.width >= 0)
        break label888;
      i33 = View.MeasureSpec.makeMeasureSpec(i4, -2147483648);
      localHomeView.measure(i33, View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
      int i34 = localHomeView.getMeasuredWidth() + localHomeView.cz();
      i7 = Math.max(0, i4 - i34);
      i6 = Math.max(0, i7 - i34);
    }
    while (true)
    {
      if ((this.me != null) && (this.me.getParent() == this))
      {
        i7 = c(this.me, i7, i3);
        i5 = Math.max(0, i5 - this.me.getMeasuredWidth());
      }
      if ((this.mX != null) && (this.mX.getVisibility() != 8))
      {
        i7 = c(this.mX, i7, i3);
        i5 = Math.max(0, i5 - this.mX.getMeasuredWidth());
      }
      int i8;
      label480: int i9;
      label512: int i10;
      View localView1;
      if ((this.mE != null) && (this.mE.getVisibility() != 8) && ((0x8 & this.mM) != 0))
      {
        i8 = 1;
        if (this.nl == null);
        switch (this.mL)
        {
        default:
          i9 = i6;
          i10 = i7;
          if (this.nl != null)
            localView1 = this.nl;
          break;
        case 1:
        case 2:
        }
      }
      while (true)
      {
        label533: ActionBar.LayoutParams localLayoutParams;
        label564: int i15;
        int i16;
        label623: int i17;
        int i18;
        label669: int i19;
        label689: int i20;
        int i21;
        if (localView1 != null)
        {
          ViewGroup.LayoutParams localLayoutParams1 = generateLayoutParams(localView1.getLayoutParams());
          if (!(localLayoutParams1 instanceof ActionBar.LayoutParams))
            break label1160;
          localLayoutParams = (ActionBar.LayoutParams)localLayoutParams1;
          int i14 = 0;
          i15 = 0;
          if (localLayoutParams != null)
          {
            i15 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
            i14 = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
          }
          if ((this.mi <= 0) || (localLayoutParams1.height == -2))
            break label1166;
          i16 = 1073741824;
          if (localLayoutParams1.height >= 0)
            i2 = Math.min(localLayoutParams1.height, i2);
          i17 = Math.max(0, i2 - i14);
          if (localLayoutParams1.width == -2)
            break label1174;
          i18 = 1073741824;
          if (localLayoutParams1.width < 0)
            break label1182;
          i19 = Math.min(localLayoutParams1.width, i10);
          i20 = Math.max(0, i19 - i15);
          if (localLayoutParams == null)
            break label1189;
          i21 = localLayoutParams.gravity;
          label712: if (((i21 & 0x7) != 1) || (localLayoutParams1.width != -1))
            break label1292;
        }
        label1160: label1292: for (int i22 = 2 * Math.min(i9, i5); ; i22 = i20)
        {
          localView1.measure(View.MeasureSpec.makeMeasureSpec(i22, i18), View.MeasureSpec.makeMeasureSpec(i17, i16));
          i10 -= i15 + localView1.getMeasuredWidth();
          if ((this.nl == null) && (i8 != 0))
          {
            c(this.mE, i10, View.MeasureSpec.makeMeasureSpec(this.mi, 1073741824));
            Math.max(0, i9 - this.mE.getMeasuredWidth());
          }
          int i11;
          int i12;
          label833: int i13;
          if (this.mi <= 0)
          {
            i11 = 0;
            i12 = 0;
            if (i12 < i)
            {
              i13 = m + getChildAt(i12).getMeasuredHeight();
              if (i13 <= i11)
                break label1285;
            }
          }
          while (true)
          {
            i12++;
            i11 = i13;
            break label833;
            k = View.MeasureSpec.getSize(paramInt2);
            break label199;
            label879: localHomeView = this.mP;
            break label268;
            label888: i33 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
            break label303;
            i8 = 0;
            break label480;
            if (this.mU == null)
              break label512;
            if (i8 != 0);
            for (int i28 = 2 * this.mZ; ; i28 = this.mZ)
            {
              int i29 = Math.max(0, i7 - i28);
              int i30 = Math.max(0, i6 - i28);
              this.mU.measure(View.MeasureSpec.makeMeasureSpec(i29, -2147483648), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
              int i31 = this.mU.getMeasuredWidth();
              int i32 = Math.max(0, i29 - i31);
              i9 = Math.max(0, i30 - i31);
              i10 = i32;
              break;
            }
            if (this.jdField_if == null)
              break label512;
            if (i8 != 0);
            for (int i23 = 2 * this.mZ; ; i23 = this.mZ)
            {
              int i24 = Math.max(0, i7 - i23);
              int i25 = Math.max(0, i6 - i23);
              this.jdField_if.measure(View.MeasureSpec.makeMeasureSpec(i24, -2147483648), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
              int i26 = this.jdField_if.getMeasuredWidth();
              int i27 = Math.max(0, i24 - i26);
              i9 = Math.max(0, i25 - i26);
              i10 = i27;
              break;
            }
            if (((0x10 & this.mM) == 0) || (this.mV == null))
              break label1299;
            localView1 = this.mV;
            break label533;
            localLayoutParams = null;
            break label564;
            label1166: i16 = -2147483648;
            break label623;
            label1174: i18 = -2147483648;
            break label669;
            label1182: i19 = i10;
            break label689;
            label1189: i21 = 19;
            break label712;
            setMeasuredDimension(j, i11);
            while (true)
            {
              if (this.ic != null)
                this.ic.C(getMeasuredHeight());
              if ((this.mW == null) || (this.mW.getVisibility() == 8))
                break;
              this.mW.measure(View.MeasureSpec.makeMeasureSpec(j - 2 * this.mY, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), -2147483648));
              return;
              setMeasuredDimension(j, k);
            }
            i13 = i11;
          }
        }
        label1285: label1299: localView1 = null;
      }
      label1305: i6 = i5;
      i7 = i4;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ActionBarView.SavedState localSavedState = (ActionBarView.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if ((localSavedState.nw != 0) && (this.nk != null) && (this.ng != null))
    {
      android.support.v4.a.a.b localb = (android.support.v4.a.a.b)this.ng.findItem(localSavedState.nw);
      if (localb != null)
        localb.expandActionView();
    }
    if (localSavedState.nx)
      super.cn();
  }

  public Parcelable onSaveInstanceState()
  {
    ActionBarView.SavedState localSavedState = new ActionBarView.SavedState(super.onSaveInstanceState());
    if ((this.nk != null) && (this.nk.nr != null))
      localSavedState.nw = this.nk.nr.getItemId();
    localSavedState.nx = super.bz();
    return localSavedState;
  }

  public final void s(boolean paramBoolean)
  {
    int i;
    if (this.mg != paramBoolean)
    {
      if (this.me != null)
      {
        ViewGroup localViewGroup = (ViewGroup)this.me.getParent();
        if (localViewGroup != null)
          localViewGroup.removeView(this.me);
        if (!paramBoolean)
          break label138;
        if (this.ie != null)
          this.ie.addView(this.me);
        this.me.getLayoutParams().width = -1;
        this.me.requestLayout();
      }
      if (this.ie != null)
      {
        ActionBarContainer localActionBarContainer = this.ie;
        if (!paramBoolean)
          break label161;
        i = 0;
        label99: localActionBarContainer.setVisibility(i);
      }
      if (this.mf != null)
      {
        if (paramBoolean)
          break label167;
        this.mf.i(getResources().getBoolean(com.tencent.mm.e.NL));
      }
    }
    while (true)
    {
      super.s(paramBoolean);
      return;
      label138: addView(this.me);
      this.me.getLayoutParams().width = -2;
      break;
      label161: i = 8;
      break label99;
      label167: this.mf.i(false);
      this.mf.x(getContext().getResources().getDisplayMetrics().widthPixels);
      this.mf.bu();
    }
  }

  public final void setDisplayOptions(int paramInt)
  {
    int i = 8;
    int j = -1;
    boolean bool1 = true;
    boolean bool2;
    label38: int k;
    label53: boolean bool5;
    label78: boolean bool4;
    label121: Drawable localDrawable;
    label138: label163: boolean bool3;
    if (this.mM == j)
    {
      this.mM = paramInt;
      if ((j & 0x1F) == 0)
        break label371;
      if ((paramInt & 0x2) == 0)
        break label299;
      bool2 = bool1;
      if ((!bool2) || (this.nl != null))
        break label305;
      k = 0;
      this.mP.setVisibility(k);
      if ((j & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0)
          break label311;
        bool5 = bool1;
        this.mP.v(bool5);
        if (bool5)
          setHomeButtonEnabled(bool1);
      }
      if ((j & 0x1) != 0)
      {
        if ((this.mO == null) || ((paramInt & 0x1) == 0))
          break label317;
        bool4 = bool1;
        ActionBarView.HomeView localHomeView = this.mP;
        if (!bool4)
          break label323;
        localDrawable = this.mO;
        localHomeView.setIcon(localDrawable);
      }
      if ((j & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0)
          break label332;
        cw();
      }
      if ((this.mE != null) && ((j & 0x6) != 0))
      {
        if ((0x4 & this.mM) == 0)
          break label343;
        bool3 = bool1;
        label190: View localView = this.mS;
        if (!bool2)
        {
          if (!bool3)
            break label349;
          i = 0;
        }
        label208: localView.setVisibility(i);
        LinearLayout localLinearLayout = this.mE;
        if ((bool2) || (!bool3))
          break label354;
        label230: localLinearLayout.setEnabled(bool1);
      }
      if (((j & 0x10) != 0) && (this.mV != null))
      {
        if ((paramInt & 0x10) == 0)
          break label360;
        addView(this.mV);
      }
      label266: requestLayout();
    }
    while (true)
    {
      if (this.mP.isEnabled())
        break label378;
      this.mP.setContentDescription(null);
      return;
      j = paramInt ^ this.mM;
      break;
      label299: bool2 = false;
      break label38;
      label305: k = i;
      break label53;
      label311: bool5 = false;
      break label78;
      label317: bool4 = false;
      break label121;
      label323: localDrawable = this.iw;
      break label138;
      label332: removeView(this.mE);
      break label163;
      label343: bool3 = false;
      break label190;
      label349: i = 4;
      break label208;
      label354: bool1 = false;
      break label230;
      label360: removeView(this.mV);
      break label266;
      label371: invalidate();
    }
    label378: if ((paramInt & 0x4) != 0)
    {
      this.mP.setContentDescription(this.mContext.getResources().getText(n.bro));
      return;
    }
    this.mP.setContentDescription(this.mContext.getResources().getText(n.brn));
  }

  public final void setHomeButtonEnabled(boolean paramBoolean)
  {
    this.mP.setEnabled(paramBoolean);
    this.mP.setFocusable(paramBoolean);
    if (!paramBoolean)
    {
      this.mP.setContentDescription(null);
      return;
    }
    if ((0x4 & this.mM) != 0)
    {
      this.mP.setContentDescription(this.mContext.getResources().getText(n.bro));
      return;
    }
    this.mP.setContentDescription(this.mContext.getResources().getText(n.brn));
  }

  public final void setIcon(int paramInt)
  {
    Drawable localDrawable = this.mContext.getResources().getDrawable(paramInt);
    this.iw = localDrawable;
    if ((localDrawable != null) && (((0x1 & this.mM) == 0) || (this.mO == null)))
      this.mP.setIcon(localDrawable);
    if (this.nl != null)
      this.mQ.setIcon(this.iw.getConstantState().newDrawable(getResources()));
  }

  public final void setLogo(Drawable paramDrawable)
  {
    this.mO = paramDrawable;
    if ((paramDrawable != null) && ((0x1 & this.mM) != 0))
      this.mP.setIcon(paramDrawable);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    this.nc = true;
    g(paramCharSequence);
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }

  public final void u(boolean paramBoolean)
  {
    this.ne = paramBoolean;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarView
 * JD-Core Version:    0.6.2
 */