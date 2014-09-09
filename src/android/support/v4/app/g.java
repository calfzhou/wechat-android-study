package android.support.v4.app;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class g extends cm
{
  g(FragmentActivity paramFragmentActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
    case 1:
      do
        return;
      while (!this.bb.aX);
      this.bb.b(false);
      return;
    case 2:
    }
    this.bb.aU.dispatchResume();
    this.bb.aU.s();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.g
 * JD-Core Version:    0.6.2
 */