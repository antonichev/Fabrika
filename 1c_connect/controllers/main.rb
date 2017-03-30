require_relative 'connector1c'
require_relative 'base'

module Controllers
  class Main < Controllers::Base
      @@user = ''
      @@pass = ''
      
      get '/' do
        erb :index
      end

      get '/user/:id' do
        id = params['id'].to_s
        
        page_table = @@connection.get_user_webpage(@@user)

        erb :user, locals: { page: page_table }
      end

      post '/authorization' do
        @@user = params[:login]
        @@pass = params[:password]

        @@connection = Connector1C.new
        @@role = @@connection.get_user_data(@@user.to_s, @@pass.to_s)

        case @@role
          when 'user' 
            redirect "/user/#{@@user}"
          when 'partner' 
            redirect '/partner'
          when 'observer' 
            redirect '/observer'
          when 'admin' 
            redirect '/admin'
          else
            redirect 'error'
        end
      end

      get '/error' do
        File.new('public/404.html').readlines
      end

      not_found do
    	  status 404
    	  File.new('public/404.html').readlines
  	  end
  end
end