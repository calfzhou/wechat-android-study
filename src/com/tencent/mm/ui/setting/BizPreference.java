package com.tencent.mm.ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.q.d;
import com.tencent.mm.q.v;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public final class BizPreference extends Preference
{
  private LinearLayout fKm;
  private int height = -1;
  private Bitmap jEb = null;
  private ViewGroup jLl;
  private TextView jLm;
  private List jLn;
  private boolean jLo = false;

  public BizPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BizPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
    setWidgetLayoutResource(k.bjA);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if (this.jLl != null)
    {
      this.jLl.removeAllViews();
      if ((this.jLn != null) && (this.jLl.getChildCount() <= 0))
      {
        int i = this.jLn.size();
        for (int j = 0; (j < i) && (j < 4); j++)
        {
          View localView = View.inflate(getContext(), k.bno, null);
          d locald = (d)this.jLn.get(j);
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = ((d)this.jLn.get(j)).username;
          z.d("!32@/B4Tb64lLpJNxjUS7wBxbHqTClkWPvhv", "biz username=%s", arrayOfObject1);
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = ((d)this.jLn.get(j)).dpL;
          z.d("!32@/B4Tb64lLpJNxjUS7wBxbHqTClkWPvhv", "biz iconUrl=%s", arrayOfObject2);
          ImageView localImageView = (ImageView)localView.findViewById(i.ako);
          Bitmap localBitmap = v.b(locald.username, locald.dpL, h.Xu);
          if (localBitmap == null)
          {
            if ((this.jEb == null) || (this.jEb.isRecycled()))
              this.jEb = BitmapFactory.decodeResource(getContext().getResources(), h.SW);
            localBitmap = this.jEb;
          }
          if ((localBitmap != null) && (!localBitmap.isRecycled()))
            localImageView.setImageBitmap(localBitmap);
          this.jLl.addView(localView);
        }
        this.jLl.setVisibility(0);
        this.jLm.setVisibility(8);
      }
      if (this.jLo)
      {
        this.jLl.setVisibility(8);
        this.jLm.setVisibility(0);
      }
      if (this.height != -1)
        this.fKm.setMinimumHeight(this.height);
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biH, localViewGroup);
    this.fKm = ((LinearLayout)localView.findViewById(i.aEp));
    this.jLl = ((ViewGroup)localView.findViewById(i.ant));
    this.jLm = ((TextView)localView.findViewById(i.anu));
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.BizPreference
 * JD-Core Version:    0.6.2
 */