package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import java.lang.ref.WeakReference;

final class r
  implements View.OnClickListener
{
  r(q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("free_wifi_source", 2);
    a.b((Context)q.a(this.iWL).get(), "freewifi", ".ui.FreeWifiEntryUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.r
 * JD-Core Version:    0.6.2
 */