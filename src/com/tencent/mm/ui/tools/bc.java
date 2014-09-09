package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.mm.ui.base.cm;

final class bc
  implements cm
{
  bc(ba paramba)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 0:
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("CropImage_OutputPath", this.jPC.jPx.getIntent().getStringExtra("CropImage_OutputPath"));
      localIntent2.putExtra("OP_CODE", 1);
      this.jPC.jPx.setResult(-1, localIntent2);
      this.jPC.jPx.finish();
      return;
    case 1:
    }
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("CropImage_OutputPath", this.jPC.jPx.getIntent().getStringExtra("CropImage_OutputPath"));
    localIntent1.putExtra("OP_CODE", 2);
    this.jPC.jPx.setResult(-1, localIntent1);
    this.jPC.jPx.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bc
 * JD-Core Version:    0.6.2
 */