package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class gb
  implements View.OnClickListener
{
  gb(SearchViewNotRealTimeHelper paramSearchViewNotRealTimeHelper)
  {
  }

  public final void onClick(View paramView)
  {
    z.v("!56@/B4Tb64lLpLefBCxqnmMg3WMfx9nFLyovQojYDyB2OJFMJ1DPCcm+g==", "home btn click");
    if (SearchViewNotRealTimeHelper.c(this.jUI) != null)
      SearchViewNotRealTimeHelper.c(this.jUI).Jn();
    if (SearchViewNotRealTimeHelper.e(this.jUI) != null)
      SearchViewNotRealTimeHelper.e(this.jUI).aZD();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gb
 * JD-Core Version:    0.6.2
 */