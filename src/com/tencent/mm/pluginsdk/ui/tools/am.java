package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

final class am
  implements t
{
  am(ag paramag)
  {
  }

  public final void i(String paramString, Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    boolean bool = false;
    if (paramBitmap == null)
      bool = true;
    arrayOfObject[1] = Boolean.valueOf(bool);
    z.v("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "on get picture finish, notifyKey[%s], bitmap is null[%B]", arrayOfObject);
    if (paramBitmap == null)
      return;
    ag.b(this.hLE).put(paramString, paramBitmap);
    ImageView localImageView = (ImageView)ag.c(this.hLE).get(paramString);
    if (localImageView != null)
    {
      ag.d(this.hLE).remove(localImageView);
      ag.e(this.hLE).post(new an(this, localImageView, paramBitmap));
    }
    ag.c(this.hLE).remove(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.am
 * JD-Core Version:    0.6.2
 */