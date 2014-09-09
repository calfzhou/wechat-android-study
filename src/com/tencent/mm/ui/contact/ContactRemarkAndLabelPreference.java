package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.ArrayList;

public class ContactRemarkAndLabelPreference extends Preference
{
  private TextView eyb;
  private TextView jyA;
  private boolean jyB = false;
  private String jyC;
  private String jyD;
  private String jyE;
  private TextView jyz;
  private Context mContext;

  public ContactRemarkAndLabelPreference(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
  }

  public ContactRemarkAndLabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public ContactRemarkAndLabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    setLayoutResource(k.biA);
  }

  private void Mg()
  {
    if ((this.eyb != null) && (!ap.jb(this.jyC)))
    {
      this.eyb.setVisibility(0);
      this.eyb.setText(this.jyC);
    }
    if (this.jyz != null)
      if (!this.jyB)
      {
        this.jyz.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        i = 0;
        if (!ap.jb(this.jyD))
        {
          this.jyz.setVisibility(0);
          this.jyz.setText(this.jyD);
        }
      }
    for (int i = 1; ; i = 0)
    {
      if ((this.jyA != null) && (!ap.jb(this.jyE)))
      {
        i |= 2;
        this.jyA.setVisibility(0);
        this.jyA.setText(this.jyE);
      }
      int j = i;
      if (j == 1)
        ((RelativeLayout.LayoutParams)this.jyz.getLayoutParams()).addRule(15);
      if (j == 2)
      {
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.jyA.getLayoutParams();
        localLayoutParams.addRule(3, 0);
        localLayoutParams.addRule(15);
      }
      return;
      this.jyz.setVisibility(0);
      this.jyz.setCompoundDrawablesWithIntrinsicBounds(h.aFs, 0, 0, 0);
      i = 1;
      break;
    }
  }

  public final void Cv(String paramString)
  {
    this.jyD = paramString;
    Mg();
  }

  public final void F(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      z.d("!56@/B4Tb64lLpKMnDcIAJBV363qg46PlRsMk3owVU4DbBnaXCf8cMPCrQ==", "cpan[setContactLabelStrList] labels %s null.");
      return;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramArrayList.toString();
    z.d("!56@/B4Tb64lLpKMnDcIAJBV363qg46PlRsMk3owVU4DbBnaXCf8cMPCrQ==", "cpan[setContactLabelStrList] labels %s:", arrayOfObject);
    this.jyE = ap.a(paramArrayList, this.mContext.getResources().getString(n.cCZ));
    Mg();
  }

  public final void aWS()
  {
    this.jyB = true;
    Mg();
  }

  public final void onBindView(View paramView)
  {
    this.eyb = ((TextView)paramView.findViewById(i.title));
    this.jyz = ((TextView)paramView.findViewById(i.ciu));
    this.jyA = ((TextView)paramView.findViewById(i.label));
    Mg();
    super.onBindView(paramView);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.cBu, localViewGroup);
    return localView;
  }

  public final void setTitle(String paramString)
  {
    this.jyC = paramString;
    Mg();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkAndLabelPreference
 * JD-Core Version:    0.6.2
 */