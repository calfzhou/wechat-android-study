package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.p;
import java.util.HashMap;
import junit.framework.Assert;

public final class ChoicePreference extends Preference
{
  private final HashMap dhJ = new HashMap();
  private int fyO = -1;
  private RadioGroup jgv;
  private CharSequence[] jgw;
  private CharSequence[] jgx;
  private ai jgy;
  private String value;

  public ChoicePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cvZ, paramInt, 0);
    this.jgw = localTypedArray.getTextArray(p.cwa);
    this.jgx = localTypedArray.getTextArray(p.cwb);
    localTypedArray.recycle();
    aTD();
  }

  private void aTD()
  {
    int i = 0;
    if (this.jgw == null)
      this.jgw = new CharSequence[0];
    if (this.jgx == null)
      this.jgx = new CharSequence[0];
    if (this.jgw.length == this.jgx.length);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("entries count different", bool);
      this.dhJ.clear();
      while (i < this.jgx.length)
      {
        d locald = new d(this.jgw[i], 1048576 + i);
        this.dhJ.put(this.jgx[i], locald);
        i++;
      }
    }
  }

  public final void a(ai paramai)
  {
    this.jgy = paramai;
  }

  public final String getValue()
  {
    return this.value;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if (this.jgv != null)
      this.jgv.check(this.fyO);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.biO, localViewGroup);
    this.jgv = ((RadioGroup)localView.findViewById(i.awX));
    int i = 0;
    if (i < this.jgx.length)
    {
      CharSequence localCharSequence = this.jgx[i];
      d locald = (d)this.dhJ.get(localCharSequence);
      if (locald != null)
      {
        if (i != 0)
          break label141;
        RadioButton localRadioButton3 = (RadioButton)localLayoutInflater.inflate(k.bio, null);
        locald.a(localRadioButton3);
        this.jgv.addView(localRadioButton3);
      }
      while (true)
      {
        i++;
        break;
        label141: if (i == -1 + this.jgx.length)
        {
          RadioButton localRadioButton2 = (RadioButton)localLayoutInflater.inflate(k.biq, null);
          locald.a(localRadioButton2);
          this.jgv.addView(localRadioButton2);
        }
        else
        {
          RadioButton localRadioButton1 = (RadioButton)localLayoutInflater.inflate(k.bip, null);
          locald.a(localRadioButton1);
          this.jgv.addView(localRadioButton1);
        }
      }
    }
    this.jgv.setOnCheckedChangeListener(new e(this));
    return localView;
  }

  public final void setValue(String paramString)
  {
    this.value = paramString;
    d locald = (d)this.dhJ.get(paramString);
    if (locald == null)
    {
      this.fyO = -1;
      return;
    }
    this.fyO = locald.id;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.ChoicePreference
 * JD-Core Version:    0.6.2
 */