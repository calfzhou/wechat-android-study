package com.tencent.mm.pluginsdk.model;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.cm;
import junit.framework.Assert;

public abstract class k
{
  private boolean fhJ = false;
  private cm gQj = new cm(Looper.getMainLooper());

  public abstract cm GB();

  public void c(Object[] paramArrayOfObject)
  {
  }

  public abstract Object doInBackground(Object[] paramArrayOfObject);

  public final boolean e(Object[] paramArrayOfObject)
  {
    if (this.fhJ)
      Assert.assertTrue("!32@/B4Tb64lLpL08+XdcLam3T8/VZvkXk36 Should construct a new Task", false);
    this.fhJ = true;
    c(paramArrayOfObject);
    cm localcm = GB();
    if (localcm == null)
      return false;
    localcm.post(new l(this, paramArrayOfObject));
    return true;
  }

  public void onPostExecute(Object paramObject)
  {
  }

  public void onProgressUpdate(Object[] paramArrayOfObject)
  {
  }

  public final void publishProgress(Object[] paramArrayOfObject)
  {
    this.gQj.post(new n(this, paramArrayOfObject));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.k
 * JD-Core Version:    0.6.2
 */