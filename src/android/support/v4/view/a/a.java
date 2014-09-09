package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;

public final class a
{
  private static final c fL = new f();
  private final Object fM;

  static
  {
    if ("JellyBeanMR2".equals(Build.VERSION.CODENAME))
    {
      fL = new e();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      fL = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      fL = new b();
      return;
    }
  }

  public a(Object paramObject)
  {
    this.fM = paramObject;
  }

  public static a a(a parama)
  {
    Object localObject = fL.c(parama.fM);
    if (localObject != null)
      return new a(localObject);
    return null;
  }

  public final void addAction(int paramInt)
  {
    fL.a(this.fM, paramInt);
  }

  public final void addChild(View paramView)
  {
    fL.b(this.fM, paramView);
  }

  public final Object aj()
  {
    return this.fM;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    a locala;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        locala = (a)paramObject;
        if (this.fM != null)
          break;
      }
      while (locala.fM == null);
      return false;
    }
    while (this.fM.equals(locala.fM));
    return false;
  }

  public final int getActions()
  {
    return fL.d(this.fM);
  }

  public final void getBoundsInParent(Rect paramRect)
  {
    fL.a(this.fM, paramRect);
  }

  public final void getBoundsInScreen(Rect paramRect)
  {
    fL.b(this.fM, paramRect);
  }

  public final CharSequence getClassName()
  {
    return fL.e(this.fM);
  }

  public final CharSequence getContentDescription()
  {
    return fL.f(this.fM);
  }

  public final int getMovementGranularities()
  {
    return fL.t(this.fM);
  }

  public final CharSequence getPackageName()
  {
    return fL.g(this.fM);
  }

  public final int hashCode()
  {
    if (this.fM == null)
      return 0;
    return this.fM.hashCode();
  }

  public final boolean isAccessibilityFocused()
  {
    return fL.v(this.fM);
  }

  public final boolean isClickable()
  {
    return fL.k(this.fM);
  }

  public final boolean isEnabled()
  {
    return fL.l(this.fM);
  }

  public final boolean isFocusable()
  {
    return fL.m(this.fM);
  }

  public final boolean isFocused()
  {
    return fL.n(this.fM);
  }

  public final boolean isLongClickable()
  {
    return fL.o(this.fM);
  }

  public final boolean isSelected()
  {
    return fL.r(this.fM);
  }

  public final boolean isVisibleToUser()
  {
    return fL.u(this.fM);
  }

  public final void recycle()
  {
    fL.s(this.fM);
  }

  public final void setAccessibilityFocused(boolean paramBoolean)
  {
    fL.i(this.fM, paramBoolean);
  }

  public final void setBoundsInParent(Rect paramRect)
  {
    fL.c(this.fM, paramRect);
  }

  public final void setBoundsInScreen(Rect paramRect)
  {
    fL.d(this.fM, paramRect);
  }

  public final void setClassName(CharSequence paramCharSequence)
  {
    fL.a(this.fM, paramCharSequence);
  }

  public final void setClickable(boolean paramBoolean)
  {
    fL.a(this.fM, paramBoolean);
  }

  public final void setContentDescription(CharSequence paramCharSequence)
  {
    fL.b(this.fM, paramCharSequence);
  }

  public final void setEnabled(boolean paramBoolean)
  {
    fL.b(this.fM, paramBoolean);
  }

  public final void setFocusable(boolean paramBoolean)
  {
    fL.c(this.fM, paramBoolean);
  }

  public final void setFocused(boolean paramBoolean)
  {
    fL.d(this.fM, paramBoolean);
  }

  public final void setLongClickable(boolean paramBoolean)
  {
    fL.e(this.fM, paramBoolean);
  }

  public final void setMovementGranularities(int paramInt)
  {
    fL.b(this.fM, paramInt);
  }

  public final void setPackageName(CharSequence paramCharSequence)
  {
    fL.c(this.fM, paramCharSequence);
  }

  public final void setParent(View paramView)
  {
    fL.c(this.fM, paramView);
  }

  public final void setScrollable(boolean paramBoolean)
  {
    fL.f(this.fM, paramBoolean);
  }

  public final void setSelected(boolean paramBoolean)
  {
    fL.g(this.fM, paramBoolean);
  }

  public final void setSource(View paramView)
  {
    fL.d(this.fM, paramView);
  }

  public final void setText(CharSequence paramCharSequence)
  {
    fL.d(this.fM, paramCharSequence);
  }

  public final void setVisibleToUser(boolean paramBoolean)
  {
    fL.h(this.fM, paramBoolean);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Rect localRect = new Rect();
    getBoundsInParent(localRect);
    localStringBuilder.append("; boundsInParent: " + localRect);
    getBoundsInScreen(localRect);
    localStringBuilder.append("; boundsInScreen: " + localRect);
    localStringBuilder.append("; packageName: ").append(getPackageName());
    localStringBuilder.append("; className: ").append(getClassName());
    localStringBuilder.append("; text: ").append(fL.h(this.fM));
    localStringBuilder.append("; contentDescription: ").append(getContentDescription());
    localStringBuilder.append("; viewId: ").append(fL.w(this.fM));
    localStringBuilder.append("; checkable: ").append(fL.i(this.fM));
    localStringBuilder.append("; checked: ").append(fL.j(this.fM));
    localStringBuilder.append("; focusable: ").append(isFocusable());
    localStringBuilder.append("; focused: ").append(isFocused());
    localStringBuilder.append("; selected: ").append(isSelected());
    localStringBuilder.append("; clickable: ").append(isClickable());
    localStringBuilder.append("; longClickable: ").append(isLongClickable());
    localStringBuilder.append("; enabled: ").append(isEnabled());
    localStringBuilder.append("; password: ").append(fL.p(this.fM));
    localStringBuilder.append("; scrollable: " + fL.q(this.fM));
    localStringBuilder.append("; [");
    int i = getActions();
    if (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      int k = i & (j ^ 0xFFFFFFFF);
      String str;
      switch (j)
      {
      default:
        str = "ACTION_UNKNOWN";
      case 1:
      case 2:
      case 4:
      case 8:
      case 16:
      case 32:
      case 64:
      case 128:
      case 256:
      case 512:
      case 1024:
      case 2048:
      case 4096:
      case 8192:
      case 65536:
      case 16384:
      case 32768:
      case 131072:
      }
      while (true)
      {
        localStringBuilder.append(str);
        if (k != 0)
          localStringBuilder.append(", ");
        i = k;
        break;
        str = "ACTION_FOCUS";
        continue;
        str = "ACTION_CLEAR_FOCUS";
        continue;
        str = "ACTION_SELECT";
        continue;
        str = "ACTION_CLEAR_SELECTION";
        continue;
        str = "ACTION_CLICK";
        continue;
        str = "ACTION_LONG_CLICK";
        continue;
        str = "ACTION_ACCESSIBILITY_FOCUS";
        continue;
        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue;
        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue;
        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue;
        str = "ACTION_NEXT_HTML_ELEMENT";
        continue;
        str = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue;
        str = "ACTION_SCROLL_FORWARD";
        continue;
        str = "ACTION_SCROLL_BACKWARD";
        continue;
        str = "ACTION_CUT";
        continue;
        str = "ACTION_COPY";
        continue;
        str = "ACTION_PASTE";
        continue;
        str = "ACTION_SET_SELECTION";
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.a
 * JD-Core Version:    0.6.2
 */