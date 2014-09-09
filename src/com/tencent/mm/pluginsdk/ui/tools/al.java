package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.z;

final class al extends Thread
{
  al(ag paramag, String paramString, SparseArray paramSparseArray, ar paramar)
  {
    super(paramString);
  }

  public final void run()
  {
    z.i("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "begin do recycled");
    for (int i = 0; i < this.hLF.size(); i++)
    {
      Bitmap localBitmap = (Bitmap)this.hLF.valueAt(i);
      if (localBitmap != null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localBitmap.toString();
        z.d("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "recycled def bmp %s", arrayOfObject);
        localBitmap.recycle();
      }
    }
    this.hLG.clear();
    z.i("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "end do recycled");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.al
 * JD-Core Version:    0.6.2
 */