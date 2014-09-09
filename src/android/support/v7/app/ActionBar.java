package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

public abstract class ActionBar
{
  public abstract void a(c paramc);

  public abstract void aI();

  public abstract void aJ();

  public abstract void aK();

  public abstract c aL();

  public abstract View getCustomView();

  public abstract int getDisplayOptions();

  public abstract int getHeight();

  public Context getThemedContext()
  {
    return null;
  }

  public abstract void hide();

  public abstract boolean isShowing();

  public abstract void setBackgroundDrawable(Drawable paramDrawable);

  public abstract void setCustomView(int paramInt);

  public abstract void setDisplayHomeAsUpEnabled(boolean paramBoolean);

  public abstract void setDisplayOptions(int paramInt);

  public abstract void setIcon(int paramInt);

  public abstract void setLogo(Drawable paramDrawable);

  public abstract void show();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.ActionBar
 * JD-Core Version:    0.6.2
 */