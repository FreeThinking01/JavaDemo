package com.bupt.NetWork.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-25 11:02
 * @description:
 **/
public class Server {

    public static void main(String[] args) throws IOException {

        //1. 创建Channel并设为非阻塞模式
        ServerSocketChannel server = ServerSocketChannel.open();
        server.configureBlocking(false);

        //2. 绑定连接
        server.socket().bind(new InetSocketAddress(9090));

        //3. 获取选择器
        Selector selector = Selector.open();

        //4. 将通道注册到选择器上并指定监听事件
        server.register(selector, SelectionKey.OP_ACCEPT);

        //5. 轮询选择器上已经就绪的事件
        while (selector.select() > 0) {

            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();

            while (iterator.hasNext()) {

                SelectionKey selectionKey = iterator.next();

                // 接收事件就绪
                if (selectionKey.isAcceptable()) {

                    // 6. 获取客户端的链接
                    SocketChannel client = server.accept();

                    // 6.1 切换成非阻塞状态
                    client.configureBlocking(false);

                    // 6.2 注册到选择器上-->拿到客户端的连接为了读取通道的数据(监听读就绪事件)
                    client.register(selector, SelectionKey.OP_READ);

                } else if (selectionKey.isReadable()) { // 读事件就绪

                    // 7. 获取当前选择器读就绪状态的通道
                    SocketChannel client = (SocketChannel) selectionKey.channel();

                    // 7.1读取数据
                    ByteBuffer buffer = ByteBuffer.allocate(1024);

                    // 7.2得到文件通道，将客户端传递过来的图片写到本地项目下(写模式、没有则创建)
                    FileChannel outChannel = FileChannel.open(Paths.get("2.png"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

                    while (client.read(buffer) > 0) {
                        // 在读之前都要切换成读模式
                        buffer.flip();

                        outChannel.write(buffer);

                        // 读完切换成写模式，能让管道继续读取文件的数据
                        buffer.clear();
                    }
                }
                // 10. 取消选择键(已经处理过的事件，就应该取消掉了)
                iterator.remove();
            }
        }


    }
}
