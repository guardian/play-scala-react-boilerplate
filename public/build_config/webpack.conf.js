var path = require('path');
var ExtractTextPlugin = require('extract-text-webpack-plugin');

module.exports = {
  entry: "./public/index.js",
  output: {
    path: "./public",
    filename: "bundle.js"
  },
  module: {
    loaders: [
      {
        test: /\.js$/, loaders: ['babel-loader'], exclude: /node_modules/
      },
      {
        test: /\.scss$/,
        loader: ExtractTextPlugin.extract('style-loader', 'css-loader?sourceMap!sass-loader?sourceMap')
      },
      {
          test: /\.(ttf|eot|svg|gif|jp?eg)(\?v=[0-9].[0-9].[0-9])?$/,
          loader: "file-loader?name=[name].[ext]"
      }
    ]
  },
  sassLoader: {
      includePaths: [path.resolve(__dirname, '../stylesheets')]
  },
  plugins: [
      new ExtractTextPlugin('main.css')
  ]
};
