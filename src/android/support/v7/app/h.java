package android.support.v7.app;

import android.os.Bundle;
import android.view.Window;

final class h extends f
{
  h(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }

  public final ActionBar aP()
  {
    aU();
    return new m(this.hE, this.hE);
  }

  final void onCreate(Bundle paramBundle)
  {
    this.hE.getWindow().requestFeature(10);
    super.onCreate(paramBundle);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.h
 * JD-Core Version:    0.6.2
 */