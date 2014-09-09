package com.tencent.mm.ui.gallery;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.tencent.mm.model.aa;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class h
  implements AdapterView.OnItemSelectedListener
{
  h(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GestureGalleryUI.a(this.jJI, paramInt);
    this.jJI.Bt(1 + GestureGalleryUI.c(this.jJI) + " / " + GestureGalleryUI.d(this.jJI).size());
    z.d("!44@/B4Tb64lLpI3qghlmlMkBkqieoUTg8Us2r04Hi9+F7o=", "pos:" + paramInt);
    GestureGalleryUI.b(this.jJI, GestureGalleryUI.f(this.jJI).d((String)GestureGalleryUI.d(this.jJI).get(paramInt), GestureGalleryUI.e(this.jJI), paramInt));
  }

  public final void onNothingSelected(AdapterView paramAdapterView)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gallery.h
 * JD-Core Version:    0.6.2
 */