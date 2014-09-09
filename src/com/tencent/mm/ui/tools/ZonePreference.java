package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.base.preference.Preference;

public class ZonePreference extends Preference
{
  private RegionCodeDecoder.Region jVq;
  private CharSequence jVr;
  private TextView jVs;

  public ZonePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public ZonePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ZonePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  private void bbd()
  {
    if (this.jVs == null)
      return;
    if ((this.jVr != null) && (!ap.jb(this.jVr.toString())))
      this.jVs.setVisibility(0);
    while (true)
    {
      this.jVs.setText(this.jVr);
      return;
      this.jVs.setVisibility(8);
    }
  }

  public final void a(RegionCodeDecoder.Region paramRegion)
  {
    if ((paramRegion == null) || (ap.jb(paramRegion.getName())) || (ap.jb(paramRegion.getCode())))
    {
      z.e("!32@/B4Tb64lLpIVRYwUl8G7B9oFahXQDtKF", "setZoneItem item = null");
      return;
    }
    setKey(paramRegion.getCode());
    this.jVq = paramRegion;
  }

  public final RegionCodeDecoder.Region bbc()
  {
    return this.jVq;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if (this.jVq == null)
      return;
    ((TextView)paramView.findViewById(i.bae)).setText(this.jVq.getName());
    this.jVs = ((TextView)paramView.findViewById(i.aSl));
    bbd();
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.bjg, localViewGroup);
    return localView;
  }

  public final void setSummary(CharSequence paramCharSequence)
  {
    this.jVr = paramCharSequence;
    bbd();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ZonePreference
 * JD-Core Version:    0.6.2
 */