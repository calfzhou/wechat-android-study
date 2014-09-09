package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.app.v;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ActionBarView;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.mm.b;
import com.tencent.mm.d;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.ArrayList;

class k extends ActionBar
{
  private ArrayList bV = new ArrayList();
  private ActionBarActivity hE;
  private Context hX;
  private ActionBarOverlayLayout hY;
  private ActionBarContainer hZ;
  private ViewGroup ia;
  private ActionBarView ib;
  private ActionBarContextView ic;
  private ActionBarContainer ie;
  private ScrollingTabContainerView jdField_if;
  private l ig;
  private int ih = -1;
  private boolean ii;
  private ArrayList ij = new ArrayList();
  private int ik;
  private boolean il;
  private int im = 0;
  private boolean io;
  private boolean iq;
  private boolean ir;
  private boolean is = true;
  private boolean it;
  private a iu;
  private Context mContext;
  final cm mHandler = new cm();

  public k(ActionBarActivity paramActionBarActivity, a parama)
  {
    this.hE = paramActionBarActivity;
    this.mContext = paramActionBarActivity;
    this.iu = parama;
    ActionBarActivity localActionBarActivity = this.hE;
    this.hY = ((ActionBarOverlayLayout)localActionBarActivity.findViewById(i.aeh));
    if (this.hY != null)
      this.hY.a(this);
    this.ib = ((ActionBarView)localActionBarActivity.findViewById(i.aee));
    this.ic = ((ActionBarContextView)localActionBarActivity.findViewById(i.ael));
    this.hZ = ((ActionBarContainer)localActionBarActivity.findViewById(i.aeg));
    this.ia = ((ViewGroup)localActionBarActivity.findViewById(i.aTr));
    if (this.ia == null)
      this.ia = this.hZ;
    this.ie = ((ActionBarContainer)localActionBarActivity.findViewById(i.aRL));
    if ((this.ib == null) || (this.ic == null) || (this.hZ == null))
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    this.ib.a(this.ic);
    int i;
    if (this.ib.cs())
    {
      i = 1;
      this.ik = i;
      if ((0x4 & this.ib.getDisplayOptions()) == 0)
        break label366;
    }
    label366: for (int j = 1; ; j = 0)
    {
      if (j != 0)
        this.ii = true;
      android.support.v7.internal.view.a locala = android.support.v7.internal.view.a.d(this.mContext);
      boolean bool;
      if (!locala.bh())
      {
        bool = false;
        if (j == 0);
      }
      else
      {
        bool = true;
      }
      this.ib.setHomeButtonEnabled(bool);
      g(locala.bf());
      CharSequence localCharSequence = this.hE.getTitle();
      this.ib.setTitle(localCharSequence);
      return;
      i = 0;
      break;
    }
  }

  private void aY()
  {
    boolean bool1 = true;
    boolean bool2 = this.io;
    boolean bool3 = this.iq;
    int i;
    if ((!this.ir) && ((bool2) || (bool3)))
    {
      i = 0;
      if (i == 0)
        break label166;
      if (!this.is)
      {
        this.is = bool1;
        this.ia.clearAnimation();
        if (this.ia.getVisibility() != 0)
        {
          if (!aZ())
            break label161;
          label71: if (bool1)
          {
            Animation localAnimation4 = AnimationUtils.loadAnimation(this.mContext, b.Mj);
            this.ia.startAnimation(localAnimation4);
          }
          this.ia.setVisibility(0);
          if ((this.ie != null) && (this.ie.getVisibility() != 0))
          {
            if (bool1)
            {
              Animation localAnimation3 = AnimationUtils.loadAnimation(this.mContext, b.Mi);
              this.ie.startAnimation(localAnimation3);
            }
            this.ie.setVisibility(0);
          }
        }
      }
    }
    label161: label166: 
    do
    {
      do
      {
        return;
        i = bool1;
        break;
        bool1 = false;
        break label71;
      }
      while (!this.is);
      this.is = false;
      this.ia.clearAnimation();
    }
    while (this.ia.getVisibility() == 8);
    if (aZ());
    while (true)
    {
      if (bool1)
      {
        Animation localAnimation2 = AnimationUtils.loadAnimation(this.mContext, b.Ml);
        this.ia.startAnimation(localAnimation2);
      }
      this.ia.setVisibility(8);
      if ((this.ie == null) || (this.ie.getVisibility() == 8))
        break;
      if (bool1)
      {
        Animation localAnimation1 = AnimationUtils.loadAnimation(this.mContext, b.Mk);
        this.ie.startAnimation(localAnimation1);
      }
      this.ie.setVisibility(8);
      return;
      bool1 = false;
    }
  }

  private void g(boolean paramBoolean)
  {
    boolean bool1 = true;
    this.il = paramBoolean;
    boolean bool2;
    label46: label65: ActionBarView localActionBarView;
    if (!this.il)
    {
      this.ib.b(null);
      this.hZ.a(this.jdField_if);
      if (this.ib.getNavigationMode() != 2)
        break label111;
      bool2 = bool1;
      if (this.jdField_if != null)
      {
        if (!bool2)
          break label116;
        this.jdField_if.setVisibility(0);
      }
      localActionBarView = this.ib;
      if ((this.il) || (!bool2))
        break label128;
    }
    while (true)
    {
      localActionBarView.u(bool1);
      return;
      this.hZ.a(null);
      this.ib.b(this.jdField_if);
      break;
      label111: bool2 = false;
      break label46;
      label116: this.jdField_if.setVisibility(8);
      break label65;
      label128: bool1 = false;
    }
  }

  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.ib.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0)
      this.ii = true;
    this.ib.setDisplayOptions(paramInt1 & paramInt2 | i & (paramInt2 ^ 0xFFFFFFFF));
  }

  public final void a(c paramc)
  {
    boolean bool = this.bV.isEmpty();
    ScrollingTabContainerView localScrollingTabContainerView;
    int i;
    l locall;
    if (this.jdField_if == null)
    {
      localScrollingTabContainerView = new ScrollingTabContainerView(this.mContext);
      if (this.il)
      {
        localScrollingTabContainerView.setVisibility(0);
        this.ib.b(localScrollingTabContainerView);
        this.jdField_if = localScrollingTabContainerView;
      }
    }
    else
    {
      this.jdField_if.b(paramc, bool);
      i = this.bV.size();
      locall = (l)paramc;
      if (locall.ba() != null)
        break label131;
      throw new IllegalStateException("Action Bar Tab must have a Callback");
    }
    if (this.ib.getNavigationMode() == 2)
      localScrollingTabContainerView.setVisibility(0);
    while (true)
    {
      this.hZ.a(localScrollingTabContainerView);
      break;
      localScrollingTabContainerView.setVisibility(8);
    }
    label131: locall.w(i);
    this.bV.add(i, locall);
    int j = this.bV.size();
    for (int k = i + 1; k < j; k++)
      ((l)this.bV.get(k)).w(k);
    if (bool)
      b(paramc);
  }

  public final void aI()
  {
    setDisplayOptions(0, 2);
  }

  public final void aJ()
  {
    setDisplayOptions(0, 8);
  }

  public final void aK()
  {
    setDisplayOptions(16, 16);
  }

  public final c aL()
  {
    return new l(this);
  }

  public final void aQ()
  {
    g(android.support.v7.internal.view.a.d(this.mContext).bf());
  }

  final void aW()
  {
    if (!this.ir)
    {
      this.ir = true;
      aY();
    }
  }

  final void aX()
  {
    if (this.ir)
    {
      this.ir = false;
      aY();
    }
  }

  boolean aZ()
  {
    return this.it;
  }

  public final void b(c paramc)
  {
    int i = -1;
    if (this.ib.getNavigationMode() != 2)
    {
      if (paramc != null)
        i = paramc.getPosition();
      this.ih = i;
    }
    while (true)
    {
      return;
      v localv = this.hE.o().p().g();
      if (this.ig == paramc)
        if (this.ig != null)
        {
          this.ig.ba();
          this.jdField_if.M(paramc.getPosition());
        }
      while (!localv.isEmpty())
      {
        localv.commit();
        return;
        ScrollingTabContainerView localScrollingTabContainerView = this.jdField_if;
        if (paramc != null)
          i = paramc.getPosition();
        localScrollingTabContainerView.L(i);
        if (this.ig != null)
          this.ig.ba();
        this.ig = ((l)paramc);
        if (this.ig != null)
          this.ig.ba();
      }
    }
  }

  public final View getCustomView()
  {
    return this.ib.cv();
  }

  public final int getDisplayOptions()
  {
    return this.ib.getDisplayOptions();
  }

  public final int getHeight()
  {
    return this.hZ.getHeight();
  }

  public final Context getThemedContext()
  {
    int i;
    if (this.hX == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.mContext.getTheme().resolveAttribute(d.actionBarWidgetTheme, localTypedValue, true);
      i = localTypedValue.resourceId;
      if (i == 0)
        break label61;
    }
    label61: for (this.hX = new ContextThemeWrapper(this.mContext, i); ; this.hX = this.mContext)
      return this.hX;
  }

  public final void h(boolean paramBoolean)
  {
    this.it = paramBoolean;
    if (!paramBoolean)
    {
      this.ia.clearAnimation();
      if (this.ie != null)
        this.ie.clearAnimation();
    }
  }

  public void hide()
  {
    if (!this.io)
    {
      this.io = true;
      aY();
    }
  }

  public final boolean isShowing()
  {
    return this.is;
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.hZ.b(paramDrawable);
  }

  public final void setCustomView(int paramInt)
  {
    View localView = LayoutInflater.from(getThemedContext()).inflate(paramInt, this.ib, false);
    this.ib.G(localView);
  }

  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 4; ; i = 0)
    {
      setDisplayOptions(i, 4);
      return;
    }
  }

  public final void setDisplayOptions(int paramInt)
  {
    if ((paramInt & 0x4) != 0)
      this.ii = true;
    this.ib.setDisplayOptions(paramInt);
  }

  public final void setIcon(int paramInt)
  {
    this.ib.setIcon(paramInt);
  }

  public final void setLogo(Drawable paramDrawable)
  {
    this.ib.setLogo(paramDrawable);
  }

  public void show()
  {
    if (this.io)
    {
      this.io = false;
      aY();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.k
 * JD-Core Version:    0.6.2
 */