package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.base.preference.Preference;

public class ZoneRecommandPreference extends Preference
{
  private TextView fFM;
  private RegionCodeDecoder.Region jVt;
  private RegionCodeDecoder.Region jVu;
  private RegionCodeDecoder.Region jVv;
  private TextView jVw;
  private ImageView jVx;
  private int status = 0;

  public ZoneRecommandPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public ZoneRecommandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ZoneRecommandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  private void bbf()
  {
    if ((this.jVw == null) || (this.fFM == null))
      return;
    switch (this.status)
    {
    default:
      return;
    case 0:
      this.jVw.setVisibility(8);
      this.fFM.setVisibility(0);
      this.fFM.setText(n.ceZ);
      this.jVx.setImageResource(h.VH);
      setEnabled(false);
      setSelectable(false);
      return;
    case 2:
      this.jVw.setVisibility(8);
      this.fFM.setVisibility(0);
      this.fFM.setText(n.ceW);
      this.jVx.setImageResource(h.VG);
      setEnabled(false);
      setSelectable(false);
      return;
    case 1:
    }
    this.jVw.setVisibility(0);
    this.fFM.setVisibility(8);
    this.jVx.setImageResource(h.VH);
    String str = "";
    if ((this.jVt != null) && (!ap.jb(this.jVt.getName())))
      str = str + this.jVt.getName();
    if ((this.jVu != null) && (!ap.jb(this.jVu.getName())))
      str = str + " " + this.jVu.getName();
    if ((this.jVv != null) && (!ap.jb(this.jVv.getName())))
      str = str + " " + this.jVv.getName();
    this.jVw.setText(str);
    setEnabled(true);
    setSelectable(true);
  }

  public final void a(RegionCodeDecoder.Region paramRegion1, RegionCodeDecoder.Region paramRegion2, RegionCodeDecoder.Region paramRegion3)
  {
    this.status = 1;
    this.jVt = paramRegion1;
    this.jVu = paramRegion2;
    this.jVv = paramRegion3;
    bbf();
  }

  public final RegionCodeDecoder.Region[] bbe()
  {
    RegionCodeDecoder.Region[] arrayOfRegion = new RegionCodeDecoder.Region[3];
    arrayOfRegion[0] = this.jVt;
    arrayOfRegion[1] = this.jVu;
    arrayOfRegion[2] = this.jVv;
    return arrayOfRegion;
  }

  public final boolean bbg()
  {
    return this.status == 1;
  }

  public final void bbh()
  {
    this.status = 2;
    bbf();
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    bbf();
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.bjh, localViewGroup);
    this.jVw = ((TextView)localView.findViewById(i.bae));
    this.fFM = ((TextView)localView.findViewById(i.status));
    this.jVx = ((ImageView)localView.findViewById(i.aRV));
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ZoneRecommandPreference
 * JD-Core Version:    0.6.2
 */