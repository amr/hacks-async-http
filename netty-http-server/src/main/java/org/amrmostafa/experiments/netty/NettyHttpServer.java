package org.amrmostafa.experiments.netty;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

public class NettyHttpServer
{
	public static void main(String[] args)
	{
		ServerBootstrap bootstrap = new ServerBootstrap(
				new NioServerSocketChannelFactory(
						Executors.newCachedThreadPool(),
						Executors.newCachedThreadPool(),
						1));
		
		bootstrap.setPipelineFactory(new HttpServerPipelineFactory());
		
		bootstrap.bind(new InetSocketAddress(9090));
	}
}
