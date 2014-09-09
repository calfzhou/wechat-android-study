package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.p;
import java.util.List;

public class Preference
  implements Comparable
{
  private int eth = -1;
  private String frZ;
  private Drawable iw;
  private int jF;
  private ai jhC;
  private int jhD = 2147483647;
  private int jhE;
  private CharSequence jhF;
  private String jhG;
  private boolean jhH = true;
  private boolean jhI = true;
  private boolean jhJ;
  private boolean jhK = true;
  private String jhL;
  private Object jhM;
  private boolean jhN = true;
  private boolean jhO = true;
  private int jhP = k.biA;
  private int jhQ;
  private boolean jhR = false;
  private ah jhS;
  private List jhT;
  private CharSequence jz;
  private final Context mContext;

  public Preference(Context paramContext)
  {
    this(paramContext, null);
  }

  public Preference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842894);
  }

  public Preference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.mContext = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cyj, paramInt, 0);
    int i = localTypedArray.getIndexCount();
    if (i >= 0)
    {
      int j = localTypedArray.getIndex(i);
      if (j == p.cyo)
        this.jF = localTypedArray.getResourceId(j, 0);
      while (true)
      {
        i--;
        break;
        if (j == p.cyp)
        {
          this.frZ = localTypedArray.getString(j);
        }
        else if (j == p.cyw)
        {
          this.jhE = localTypedArray.getResourceId(j, 0);
          this.jz = localTypedArray.getString(j);
        }
        else if (j == p.cyv)
        {
          this.jhF = localTypedArray.getString(j);
        }
        else if (j == p.cyr)
        {
          this.jhD = localTypedArray.getInt(j, this.jhD);
        }
        else if (j == p.cyn)
        {
          this.jhG = localTypedArray.getString(j);
        }
        else if (j == p.cyq)
        {
          this.jhP = localTypedArray.getResourceId(j, this.jhP);
        }
        else if (j == p.cyx)
        {
          this.jhQ = localTypedArray.getResourceId(j, this.jhQ);
        }
        else if (j == p.cym)
        {
          this.jhH = localTypedArray.getBoolean(j, true);
        }
        else if (j == p.cyt)
        {
          this.jhI = localTypedArray.getBoolean(j, true);
        }
        else if (j == p.cys)
        {
          this.jhK = localTypedArray.getBoolean(j, this.jhK);
        }
        else if (j == p.cyl)
        {
          this.jhL = localTypedArray.getString(j);
        }
        else if (j == p.cyk)
        {
          this.jhM = null;
        }
        else if (j == p.cyu)
        {
          this.jhO = localTypedArray.getBoolean(j, this.jhO);
        }
      }
    }
    localTypedArray.recycle();
    if (!getClass().getName().startsWith("android.preference"))
      this.jhR = true;
  }

  private void d(View paramView, boolean paramBoolean)
  {
    paramView.setEnabled(paramBoolean);
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      for (int i = -1 + localViewGroup.getChildCount(); i >= 0; i--)
        d(localViewGroup.getChildAt(i), paramBoolean);
    }
  }

  private void notifyDependencyChange(boolean paramBoolean)
  {
    List localList = this.jhT;
    if (localList == null)
      return;
    int i = localList.size();
    int j = 0;
    label20: Preference localPreference;
    if (j < i)
    {
      localPreference = (Preference)localList.get(j);
      if (localPreference.jhN == paramBoolean)
        if (paramBoolean)
          break label83;
    }
    label83: for (boolean bool = true; ; bool = false)
    {
      localPreference.jhN = bool;
      localPreference.notifyDependencyChange(localPreference.shouldDisableDependents());
      localPreference.notifyChanged();
      j++;
      break label20;
      break;
    }
  }

  private boolean shouldDisableDependents()
  {
    return !isEnabled();
  }

  public void a(ai paramai)
  {
    this.jhC = paramai;
  }

  public final void aTS()
  {
    this.jhK = false;
  }

  protected final boolean callChangeListener(Object paramObject)
  {
    if (this.jhC == null)
      return true;
    return this.jhC.a(this, paramObject);
  }

  public final Context getContext()
  {
    return this.mContext;
  }

  public final String getDependency()
  {
    return this.jhL;
  }

  public final Drawable getIcon()
  {
    return this.iw;
  }

  public final String getKey()
  {
    return this.frZ;
  }

  public int getLayoutResource()
  {
    return this.jhP;
  }

  public CharSequence getSummary()
  {
    return this.jhF;
  }

  public CharSequence getTitle()
  {
    return this.jz;
  }

  public View getView(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = onCreateView(paramViewGroup);
    onBindView(paramView);
    return paramView;
  }

  public final int getWidgetLayoutResource()
  {
    return this.jhQ;
  }

  public final boolean isEnabled()
  {
    return (this.jhH) && (this.jhN);
  }

  public final boolean isPersistent()
  {
    return this.jhK;
  }

  public final boolean isSelectable()
  {
    return this.jhI;
  }

  public final int lJ()
  {
    return this.jF;
  }

  protected void notifyChanged()
  {
    if (this.jhS != null);
  }

  protected void onBindView(View paramView)
  {
    TextView localTextView1 = (TextView)paramView.findViewById(16908310);
    if (localTextView1 != null)
      localTextView1.setText(getTitle());
    TextView localTextView2 = (TextView)paramView.findViewById(16908304);
    if (localTextView2 != null)
    {
      if (TextUtils.isEmpty(getSummary()))
        break label194;
      if (localTextView2.getVisibility() != 0)
        localTextView2.setVisibility(0);
      localTextView2.setText(getSummary());
      if (this.eth != -1)
        localTextView2.setTextColor(this.eth);
    }
    ImageView localImageView = (ImageView)paramView.findViewById(16908294);
    int i;
    if (localImageView != null)
    {
      if ((this.jF != 0) || (this.iw != null))
      {
        if (this.iw == null)
          this.iw = this.mContext.getResources().getDrawable(this.jF);
        if (this.iw != null)
          localImageView.setImageDrawable(this.iw);
      }
      Drawable localDrawable = this.iw;
      i = 0;
      if (localDrawable == null)
        break label212;
    }
    while (true)
    {
      localImageView.setVisibility(i);
      if (this.jhO)
        d(paramView, isEnabled());
      return;
      label194: if (localTextView2.getVisibility() == 8)
        break;
      localTextView2.setVisibility(8);
      break;
      label212: i = 8;
    }
  }

  protected void onClick()
  {
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    View localView = localLayoutInflater.inflate(this.jhP, paramViewGroup, false);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(16908312);
    if (localViewGroup != null)
    {
      if (this.jhQ != 0)
        localLayoutInflater.inflate(this.jhQ, localViewGroup);
    }
    else
      return localView;
    localViewGroup.setVisibility(8);
    return localView;
  }

  public final void pZ(int paramInt)
  {
    this.eth = paramInt;
  }

  public final void setEnabled(boolean paramBoolean)
  {
    if (this.jhH != paramBoolean)
    {
      this.jhH = paramBoolean;
      notifyDependencyChange(shouldDisableDependents());
      notifyChanged();
    }
  }

  public final void setKey(String paramString)
  {
    this.frZ = paramString;
    if (this.jhJ)
    {
      int i;
      if (!TextUtils.isEmpty(this.frZ))
        i = 1;
      while (i == 0)
        if (this.frZ == null)
        {
          throw new IllegalStateException("Preference does not have a key assigned.");
          i = 0;
        }
        else
        {
          this.jhJ = true;
        }
    }
  }

  public final void setLayoutResource(int paramInt)
  {
    if (paramInt != this.jhP)
      this.jhR = true;
    this.jhP = paramInt;
  }

  public final void setSelectable(boolean paramBoolean)
  {
    if (this.jhI != paramBoolean)
    {
      this.jhI = paramBoolean;
      notifyChanged();
    }
  }

  public void setSummary(int paramInt)
  {
    setSummary(this.mContext.getString(paramInt));
  }

  public void setSummary(CharSequence paramCharSequence)
  {
    if (((paramCharSequence == null) && (this.jhF != null)) || ((paramCharSequence != null) && (!paramCharSequence.equals(this.jhF))))
    {
      this.jhF = paramCharSequence;
      notifyChanged();
    }
  }

  public void setTitle(int paramInt)
  {
    setTitle(this.mContext.getString(paramInt));
    this.jhE = paramInt;
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (((paramCharSequence == null) && (this.jz != null)) || ((paramCharSequence != null) && (!paramCharSequence.equals(this.jz))))
    {
      this.jhE = 0;
      this.jz = paramCharSequence;
      notifyChanged();
    }
  }

  public final void setWidgetLayoutResource(int paramInt)
  {
    if (paramInt != this.jhQ)
      this.jhR = true;
    this.jhQ = paramInt;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CharSequence localCharSequence1 = getTitle();
    if (!TextUtils.isEmpty(localCharSequence1))
      localStringBuilder.append(localCharSequence1).append(' ');
    CharSequence localCharSequence2 = getSummary();
    if (!TextUtils.isEmpty(localCharSequence2))
      localStringBuilder.append(localCharSequence2).append(' ');
    if (localStringBuilder.length() > 0)
      localStringBuilder.setLength(-1 + localStringBuilder.length());
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.Preference
 * JD-Core Version:    0.6.2
 */