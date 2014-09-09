package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class KeyValuePreference extends Preference
{
  private TextView fWR;
  private String iLL = null;
  private Drawable jgX = null;
  private boolean jgY = true;
  private boolean jgZ = true;
  private boolean jha = false;
  private int jhb = 17;
  private int jhc = 0;
  private ImageView jhd = null;
  private Drawable jhe = null;
  private List jhf = new LinkedList();

  public KeyValuePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  public final void BZ(String paramString)
  {
    this.iLL = paramString;
  }

  public final void aTI()
  {
    this.jhc = 4;
  }

  public final void aTJ()
  {
    this.jhf.clear();
  }

  public final void aTK()
  {
    this.jha = true;
    this.jhb = 49;
  }

  public final void as(View paramView)
  {
    this.jhf.add(paramView);
  }

  public final void f(Drawable paramDrawable)
  {
    this.jhe = paramDrawable;
  }

  public final void fa(boolean paramBoolean)
  {
    this.jgY = paramBoolean;
  }

  public final void fb(boolean paramBoolean)
  {
    this.jgZ = paramBoolean;
  }

  public final void g(Drawable paramDrawable)
  {
    this.jgX = paramDrawable;
  }

  public void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.fWR = ((TextView)paramView.findViewById(16908304));
    this.fWR.setSingleLine(this.jgY);
    if (this.jgZ)
      setWidgetLayoutResource(k.bjA);
    TextView localTextView = (TextView)paramView.findViewById(16908310);
    if (!ch.jb(this.iLL))
      localTextView.setText(this.iLL);
    if (this.jgX != null)
      ((ImageView)paramView.findViewById(i.axI)).setImageDrawable(this.jgX);
    this.jhd = ((ImageView)paramView.findViewById(i.ayb));
    if (this.jhe != null)
    {
      this.jhd.setVisibility(this.jhc);
      this.jhd.setImageDrawable(this.jhe);
    }
    while (true)
    {
      if (this.jha)
      {
        LinearLayout localLinearLayout2 = (LinearLayout)paramView.findViewById(i.aoI);
        if (localLinearLayout2 != null)
          localLinearLayout2.setGravity(this.jhb);
      }
      if (this.jhf.size() <= 0)
        break;
      LinearLayout localLinearLayout1 = (LinearLayout)paramView.findViewById(i.aSj);
      localLinearLayout1.removeAllViews();
      Iterator localIterator = this.jhf.iterator();
      while (localIterator.hasNext())
      {
        View localView = (View)localIterator.next();
        ViewGroup localViewGroup = (ViewGroup)localView.getParent();
        if (localViewGroup != null)
          localViewGroup.removeView(localView);
        localLinearLayout1.addView(localView);
      }
      this.jhd.setVisibility(8);
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.biV, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.KeyValuePreference
 * JD-Core Version:    0.6.2
 */