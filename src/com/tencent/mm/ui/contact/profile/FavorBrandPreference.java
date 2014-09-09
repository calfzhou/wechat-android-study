package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.q.d;
import com.tencent.mm.q.v;
import com.tencent.mm.q.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class FavorBrandPreference extends Preference
  implements x
{
  private com.tencent.mm.storage.i elz;
  private boolean hHI;
  private MaskLayout[] jDZ = new MaskLayout[4];
  private List jEa = null;
  private Bitmap jEb = null;

  public FavorBrandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public FavorBrandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
    setWidgetLayoutResource(k.bjA);
    init();
  }

  private void DP()
  {
    if ((this.elz == null) || (!this.hHI))
    {
      z.d("!44@/B4Tb64lLpL2FUKKj7lG//Pu0aYa6oL0M9T/weCI54A=", "initView : contact = " + this.elz + " bindView = " + this.hHI);
      return;
    }
    int i = 0;
    label53: d locald;
    ImageView localImageView;
    if ((this.jEa != null) && (i < this.jEa.size()) && (i < 4))
    {
      locald = (d)this.jEa.get(i);
      this.jDZ[i].setVisibility(0);
      localImageView = (ImageView)this.jDZ[i].getContentView();
      Bitmap localBitmap = v.b(locald.username, locald.dpL, h.Xu);
      if (localBitmap == null)
      {
        if ((this.jEb == null) || (this.jEb.isRecycled()))
          this.jEb = BitmapFactory.decodeResource(getContext().getResources(), h.SW);
        localBitmap = this.jEb;
      }
      if ((localBitmap == null) || (localBitmap.isRecycled()))
        break label214;
      localImageView.setImageBitmap(localBitmap);
    }
    while (true)
    {
      this.jDZ[i].setTag(locald.username);
      i++;
      break label53;
      break;
      label214: localImageView.setImageBitmap(null);
    }
  }

  private void init()
  {
    this.hHI = false;
    this.elz = null;
  }

  public final void fM(String paramString)
  {
    DP();
  }

  public final void onBindView(View paramView)
  {
    this.jDZ[0] = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.ayc));
    this.jDZ[1] = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.ayd));
    this.jDZ[2] = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.aye));
    this.jDZ[3] = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.ayf));
    this.hHI = true;
    DP();
    super.onBindView(paramView);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(com.tencent.mm.i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biN, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.FavorBrandPreference
 * JD-Core Version:    0.6.2
 */