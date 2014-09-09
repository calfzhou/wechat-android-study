package com.tencent.mm.ui.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class bn
  implements AdapterView.OnItemClickListener
{
  bn(FilterImageView paramFilterImageView)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    FilterImageView.a(this.jQy).ds(paramInt);
    try
    {
      FilterImageView.a(this.jQy, FilterImageView.jQx[paramInt].jQJ);
      FilterImageView.a(this.jQy, FilterImageView.jQx[paramInt].jQG, FilterImageView.jQx[paramInt].jQH, FilterImageView.jQx[paramInt].jQI);
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLxetNgbG3pY/jjX49X0q4a", localException.toString());
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      z.e("!32@/B4Tb64lLpLxetNgbG3pY/jjX49X0q4a", localOutOfMemoryError.toString());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bn
 * JD-Core Version:    0.6.2
 */