package com.tencent.smtt.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import java.lang.reflect.Method;

final class ao extends android.webkit.WebView
{
  public ao(WebView paramWebView, Context paramContext)
  {
    super(paramContext);
    b.cN(WebView.access$100(paramWebView));
    b.startSync();
    try
    {
      Method localMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
      localMethod.setAccessible(true);
      ((Handler)localMethod.invoke(null, new Object[0])).getLooper().getThread().setUncaughtExceptionHandler(new k());
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected final void dispatchDraw(Canvas paramCanvas)
  {
    try
    {
      super.dispatchDraw(paramCanvas);
      if ((!WebView.access$300()) && (WebView.access$400() != null))
      {
        paramCanvas.save();
        paramCanvas.drawPaint(WebView.access$400());
        paramCanvas.restore();
      }
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    WebView.access$200(this.keQ, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!hasFocus())
      requestFocus();
    try
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ao
 * JD-Core Version:    0.6.2
 */